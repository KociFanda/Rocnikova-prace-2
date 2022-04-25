package com.example.rezervacni_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartAplikace extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartAplikace.class.getResource("Hlavni-menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 550);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        System.out.println("Start aplikace");
        System.out.println("--------------------------------------------");
        System.out.println("Hlavní menu");
    }

    public static void main(String[] args) {
        launch();
    }
}