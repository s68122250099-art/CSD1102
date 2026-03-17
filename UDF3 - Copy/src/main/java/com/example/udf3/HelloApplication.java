package com.example.udf3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // ตรวจสอบชื่อไฟล์ fxml ให้ตรงกับที่คุณตั้งไว้ (ในที่นี้คือ ufd3.fxml)
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ufd3.fxml"));

        // ปรับขนาดหน้าจอเล็กน้อยให้เหมาะสมกับช่องข้อมูล 3 ช่องในแนวนอน
        Scene scene = new Scene(fxmlLoader.load(), 744, 185);
        stage.setTitle("User Data Form");
        stage.setResizable(false); // ล็อกขนาดหน้าจอไว้ให้เหมือนในรูปตัวอย่าง
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}