package com.example.rezervacni.system;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;

public class PrehledController {

    public TextArea prehledVypis;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void initialize() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("databaze.txt"));


        String vypis = "zadna data";
        vypis =br.lines().collect(Collectors.joining());

        if (vypis == null) {
            vypis = "zadna data";
        }
        System.out.println(vypis);
        String vypis2 = vypis.replace("[", "");
        String vypis3 = vypis2.replace("]", "");
        String vypis4 = vypis3.replace(",", "");
        String vypis5 = vypis4.replace("?", "\nRezervace: ");
        prehledVypis.setText(
                        "Rezervace: " + vypis5 + "\n");


    }

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

    public void vymazat(ActionEvent actionEvent) throws IOException {
        prehledVypis.clear();
        FileWriter myWriter = new FileWriter("databaze.txt");
        myWriter.write("");
    }
}
