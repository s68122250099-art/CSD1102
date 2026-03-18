package com.example.javafx;

import javafx.beans.property.*;

public class Book {
    private StringProperty title, author, publisher, review;
    private IntegerProperty year;
    private DoubleProperty rating;
    private double totalScore = 0;
    private int reviewCount = 0;

    // Constructor สำหรับสร้างหนังสือใหม่ปกติ
    public Book(String title, String author, String publisher, int year) {
        this.title = new SimpleStringProperty(title);
        this.author = new SimpleStringProperty(author);
        this.publisher = new SimpleStringProperty(publisher);
        this.year = new SimpleIntegerProperty(year);
        this.review = new SimpleStringProperty("");
        this.rating = new SimpleDoubleProperty(0.0);
    }

    // Constructor พิเศษสำหรับโหลดข้อมูลจากไฟล์
    public Book(String title, String author, String publisher, int year, double rating, String review, double totalScore, int reviewCount) {
        this.title = new SimpleStringProperty(title);
        this.author = new SimpleStringProperty(author);
        this.publisher = new SimpleStringProperty(publisher);
        this.year = new SimpleIntegerProperty(year);
        this.rating = new SimpleDoubleProperty(rating);
        this.review = new SimpleStringProperty(review);
        this.totalScore = totalScore;
        this.reviewCount = reviewCount;
    }

    public void addReviewAndRating(int newScore, String newText) {
        this.reviewCount++;
        this.totalScore += newScore;
        this.rating.set(totalScore / reviewCount);

        String currentReview = this.review.get();
        String entry = "- " + newText;
        if (currentReview == null || currentReview.isEmpty()) {
            this.review.set(entry);
        } else {
            this.review.set(currentReview + "\n" + entry);
        }
    }

    // Property methods
    public StringProperty titleProperty() { return title; }
    public StringProperty authorProperty() { return author; }
    public IntegerProperty yearProperty() { return year; }
    public DoubleProperty ratingProperty() { return rating; }
    public StringProperty reviewProperty() { return review; }

    // Getters
    public String getTitle() { return title.get(); }
    public String getAuthor() { return author.get(); }
    public String getPublisher() { return publisher.get(); }
    public int getYear() { return year.get(); }
    public double getRating() { return rating.get(); }
    public String getReview() { return review.get(); }
    public double getTotalScore() { return totalScore; }
    public int getReviewCount() { return reviewCount; }

    // Setters สำหรับข้อมูลเริ่มต้น
    public void setRating(double r) { this.rating.set(r); this.totalScore = r; this.reviewCount = 1; }
    public void setReview(String r) { this.review.set(r); }
}