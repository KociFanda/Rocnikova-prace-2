package com.example.rezervacni.system;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class KontaktController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void zpatky(ActionEvent actionEvent) throws IOException {
        System.out.println("Hlavní menu");

        root = FXMLLoader.load(getClass().getResource("Hlavni-menu.fxml"));
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(false);
        stage.setMinHeight(500);
        stage.setMinWidth(600);
        stage.show();
    }
}
