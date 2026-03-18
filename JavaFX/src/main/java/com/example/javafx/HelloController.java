package com.example.javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.io.*;
import java.util.Comparator;
import java.util.Scanner;

public class HelloController {
    @FXML private TextField txtTitle, txtAuthor, txtPublisher, txtYear, txtSearch;
    @FXML private TextArea txtReview;
    @FXML private ComboBox<Integer> comboRating;
    @FXML private ComboBox<String> comboSort;
    @FXML private TableView<Book> bookTable;
    @FXML private TableColumn<Book, String> colTitle, colAuthor, colReview;
    @FXML private TableColumn<Book, Integer> colYear;
    @FXML private TableColumn<Book, Double> colRating;

    private ObservableList<Book> bookList = FXCollections.observableArrayList();
    private final String FILE_NAME = "books_database.txt";

    @FXML
    public void initialize() {
        // 1. โหลดข้อมูลจากไฟล์เป็นอย่างแรก
        loadFromFile();

        // 2. ถ้าเปิดครั้งแรกแล้วไม่มีข้อมูล ให้ใส่ข้อมูลตัวอย่าง
        if (bookList.isEmpty()) {
            addDefaultBook("พื้นฐาน Python", "สมชาย สายโค้ด", "TechKnowledge", 2023, 5, "เนื้อหาดีมาก อธิบายเข้าใจง่าย");
            addDefaultBook("การเงิน 101", "ธนา ร่ำรวย", "MoneyMaker", 2022, 4, "พื้นฐานการลงทุนที่ดีมาก");
        }

        // 3. เชื่อมคอลัมน์ตาราง
        colTitle.setCellValueFactory(d -> d.getValue().titleProperty());
        colAuthor.setCellValueFactory(d -> d.getValue().authorProperty());
        colYear.setCellValueFactory(d -> d.getValue().yearProperty().asObject());
        colRating.setCellValueFactory(d -> d.getValue().ratingProperty().asObject());
        colReview.setCellValueFactory(d -> d.getValue().reviewProperty());

        // 4. ระบบค้นหา (Real-time Search)
        FilteredList<Book> filteredData = new FilteredList<>(bookList, p -> true);
        txtSearch.textProperty().addListener((obs, old, newVal) -> {
            filteredData.setPredicate(book -> {
                if (newVal == null || newVal.isEmpty()) return true;
                String lowerFilter = newVal.toLowerCase();
                return book.getTitle().toLowerCase().contains(lowerFilter) ||
                        book.getAuthor().toLowerCase().contains(lowerFilter);
            });
        });

        // 5. ระบบเรียงลำดับ
        comboSort.setItems(FXCollections.observableArrayList(
                "ชื่อ (ก-ฮ)", "ชื่อ (ฮ-ก)", "ปี (น้อย-มาก)", "ปี (มาก-น้อย)",
                "คะแนน (น้อย-มาก)", "คะแนน (มาก-น้อย)"
        ));

        comboSort.setOnAction(e -> {
            String selected = comboSort.getValue();
            if ("ชื่อ (ก-ฮ)".equals(selected)) bookList.sort(Comparator.comparing(Book::getTitle));
            else if ("ชื่อ (ฮ-ก)".equals(selected)) bookList.sort(Comparator.comparing(Book::getTitle).reversed());
            else if ("ปี (น้อย-มาก)".equals(selected)) bookList.sort(Comparator.comparing(Book::getYear));
            else if ("ปี (มาก-น้อย)".equals(selected)) bookList.sort(Comparator.comparing(Book::getYear).reversed());
            else if ("คะแนน (น้อย-มาก)".equals(selected)) bookList.sort(Comparator.comparing(Book::getRating));
            else if ("คะแนน (มาก-น้อย)".equals(selected)) bookList.sort(Comparator.comparing(Book::getRating).reversed());
        });

        SortedList<Book> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(bookTable.comparatorProperty());
        bookTable.setItems(sortedData);

        comboRating.setItems(FXCollections.observableArrayList(1, 2, 3, 4, 5));

        // 6. Listener เมื่อคลิกที่ตาราง (แก้ไขให้ดึง Publisher และ Year ขึ้นมาด้วย)
        bookTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                txtTitle.setText(newSelection.getTitle());
                txtAuthor.setText(newSelection.getAuthor());
                txtPublisher.setText(newSelection.getPublisher()); // เพิ่มตรงนี้
                txtYear.setText(String.valueOf(newSelection.getYear())); // เพิ่มตรงนี้ (แปลง int เป็น String)

                txtReview.clear(); // ล้างช่องรีวิวเพื่อให้พิมพ์รีวิวใหม่ต่อเข้าไป
                comboRating.setValue(null); // ล้างช่องคะแนนเพื่อให้เลือกคะแนนใหม่
            }
        });
    }

    private void addDefaultBook(String t, String a, String p, int y, int r, String rev) {
        Book b = new Book(t, a, p, y);
        b.setRating(r);
        b.setReview("- " + rev);
        bookList.add(b);
        saveToFile();
    }

    @FXML
    protected void onAddButtonClick() {
        try {
            if (txtTitle.getText().isEmpty()) return;
            Book b = new Book(
                    txtTitle.getText(),
                    txtAuthor.getText(),
                    txtPublisher.getText(),
                    Integer.parseInt(txtYear.getText())
            );
            bookList.add(b);
            saveToFile();
            clearFields();
        } catch (NumberFormatException e) {
            new Alert(Alert.AlertType.WARNING, "กรุณากรอกปีที่พิมพ์เป็นตัวเลข").show();
        }
    }

    @FXML
    protected void onUpdateReviewClick() {
        Book selected = bookTable.getSelectionModel().getSelectedItem();
        if (selected != null && comboRating.getValue() != null) {
            // ใช้ Method addReviewAndRating เพื่อเฉลี่ยคะแนนและต่อข้อความรีวิว
            selected.addReviewAndRating(comboRating.getValue(), txtReview.getText());
            bookTable.refresh();
            saveToFile();
            clearFields();
        } else {
            new Alert(Alert.AlertType.INFORMATION, "กรุณาเลือกเล่มในตารางและเลือกคะแนนที่จะให้").show();
        }
    }

    // --- ระบบจัดการไฟล์ถาวร (Persistence) ---

    private void saveToFile() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            for (Book b : bookList) {
                // เปลี่ยน \n เป็น [BR] เพื่อให้บันทึกข้อมูล 1 เล่มต่อ 1 บรรทัดได้ถูกต้อง
                String cleanReview = b.getReview().replace("\n", "[BR]");
                writer.write(b.getTitle() + "[SEP]" +
                        b.getAuthor() + "[SEP]" +
                        b.getPublisher() + "[SEP]" +
                        b.getYear() + "[SEP]" +
                        b.getRating() + "[SEP]" +
                        cleanReview + "[SEP]" +
                        b.getTotalScore() + "[SEP]" +
                        b.getReviewCount() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Save Error: " + e.getMessage());
        }
    }

    private void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] d = line.split("\\[SEP\\]");
                if (d.length == 8) {
                    String review = d[5].replace("[BR]", "\n"); // เปลี่ยน [BR] กลับเป็นขึ้นบรรทัดใหม่
                    Book b = new Book(
                            d[0], d[1], d[2],
                            Integer.parseInt(d[3]),
                            Double.parseDouble(d[4]),
                            review,
                            Double.parseDouble(d[6]),
                            Integer.parseInt(d[7])
                    );
                    bookList.add(b);
                }
            }
        } catch (Exception e) {
            System.err.println("Load Error: " + e.getMessage());
        }
    }

    private void clearFields() {
        txtTitle.clear(); txtAuthor.clear(); txtPublisher.clear();
        txtYear.clear(); txtReview.clear(); comboRating.setValue(null);
    }
}