package com.example.rezervacni_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RezervaceController {

    public CheckBox malyStul1;
    public CheckBox malyStul2;

    public CheckBox velkyStul1;
    public CheckBox velkyStul2;
    public CheckBox velkyStul3;
    public CheckBox velkyStul4;
    public CheckBox velkyStul5;
    public CheckBox velkyStul6;

    public CheckBox stredniStulNahore1;
    public CheckBox stredniStulNahore2;
    public CheckBox stredniStulNahore3;
    public CheckBox stredniStulNahore4;

    public CheckBox stredniStulDole1;
    public CheckBox stredniStulDole2;
    public CheckBox stredniStulDole3;
    public CheckBox stredniStulDole4;
    
    public TextArea rezervaceSouhrn;
    public TextField jmeno;
    public TextField email;


    private Stage stage;
    private Scene scene;
    private Parent root;

    public void zpatky(ActionEvent actionEvent) throws IOException {
        System.out.println("Hlavní menu");

        root = FXMLLoader.load(getClass().getResource("Hlavni-menu.fxml"));
        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);;
        stage.setScene(scene);
        stage.setMaximized(false);
        stage.setMinHeight(600);
        stage.setMinWidth(550);
        stage.show();
    }

    public void vytvoritRezervaci(ActionEvent actionEvent) {
        System.out.println("todo");
    }

    public void select(ActionEvent actionEvent) {
        String source2 = actionEvent.getSource().toString();
       //vypadá to hloupě ale funguje to :)
        String[] parts = source2.split("=");
        String part1 = parts[0];
        String part2 = parts[1];
        String source3 = part2;
        String[] parts2 = part2.split(",");
        String part3 = parts2[0];
        String part4 = parts2[1];

        String vybrany_stul_id = part3;
        System.out.println("ID vybraného stolu je :" + vybrany_stul_id);



    }
    }

