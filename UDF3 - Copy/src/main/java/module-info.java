module com.example.udf3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.udf3 to javafx.fxml;
    exports com.example.udf3;
}