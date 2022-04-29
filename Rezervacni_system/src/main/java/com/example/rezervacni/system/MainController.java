package com.example.rezervacni.system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

    public class MainController {
    @FXML
    private Label welcomeText;
    public Button NewGameButton;
    public AnchorPane mainLayout;
    public ImageView imageView;
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    public void NoveOknoRezervace(ActionEvent actionEvent) throws IOException {
        System.out.println("Rezervace");
        root = FXMLLoader.load(getClass().getResource("Rezervace.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);;
        stage.setScene(scene);
        stage.setMaximized(false);
        stage.setMinHeight(700);
        stage.setMinWidth(600);
        stage.setResizable(false);

        stage.show();
    }


        public void konec(ActionEvent actionEvent) {
        Platform.exit();
        }

        public void prehled(ActionEvent actionEvent) throws IOException {
            System.out.println("Přehled");

            root = FXMLLoader.load(getClass().getResource("Prehled.fxml"));
            stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);;
            stage.setScene(scene);
            stage.setMaximized(false);
            stage.setMinHeight(500);
            stage.setMinWidth(600);
            stage.setResizable(false);

            stage.show();


        }

        public void kontakt(ActionEvent actionEvent) throws IOException {
            System.out.println("Kontakt");

            root = FXMLLoader.load(getClass().getResource("Kontakt.fxml"));
            stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);;
            stage.setScene(scene);
            stage.setMaximized(false);
            stage.setMinHeight(500);
            stage.setMinWidth(600);
            stage.setResizable(false);

            stage.show();

        }
    }