package com.example.rezervacni.system;

import com.example.rezervacni.system.save.writeToFile;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

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
    public TextField cas;
    public DatePicker datum;


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
        stage.setMinHeight(600);
        stage.setMinWidth(550);
        stage.show();
    }


    ArrayList<String> rezervaceFINALE = new ArrayList<String>();
    String jmeno2;
    String email2;
    String cas2;
    String datum2;


    public void vytvoritRezervaci(ActionEvent actionEvent) throws IOException {
        System.out.println("VYTVÁŘÍM REZERVACI. ZÁPIS DO DATABÁZE");
        //Velky stul pro 6 lidí
        if (velkyStul1.isSelected()) {
            rezervaceFINALE.add(velkyStul1.getId().toString());
        }  if (velkyStul2.isSelected()) {
            rezervaceFINALE.add(velkyStul2.getId().toString());
        }  if (velkyStul3.isSelected()) {
            rezervaceFINALE.add(velkyStul3.getId().toString());
        }  if (velkyStul4.isSelected()) {
            rezervaceFINALE.add(velkyStul4.getId().toString());
        }  if (velkyStul5.isSelected()) {
            rezervaceFINALE.add(velkyStul5.getId().toString());
        }  if (velkyStul6.isSelected()) {
            rezervaceFINALE.add(velkyStul6.getId().toString());
        }
        //maly stul pro 2
        else if (malyStul1.isSelected()) {
            rezervaceFINALE.add(malyStul1.getId().toString());
        } else if (malyStul2.isSelected()) {
            rezervaceFINALE.add(malyStul2.getId().toString());
        }
        //stredni stul pro 4 DOLE
        else if (stredniStulDole1.isSelected()) {
            rezervaceFINALE.add(stredniStulDole1.toString());
        } else if (stredniStulDole2.isSelected()) {
            rezervaceFINALE.add(stredniStulDole2.toString());
        } else if (stredniStulDole3.isSelected()) {
            rezervaceFINALE.add(stredniStulDole3.toString());
        } else if (stredniStulDole4.isSelected()) {
            rezervaceFINALE.add(stredniStulDole4.toString());
        }
        //stredni stul pro 4 NAHORE
        else if (stredniStulNahore1.isSelected()) {
            rezervaceFINALE.add(stredniStulNahore1.toString());
        } else if (stredniStulNahore1.isSelected()) {
            rezervaceFINALE.add(stredniStulNahore1.toString());
        } else if (stredniStulNahore1.isSelected()) {
            rezervaceFINALE.add(stredniStulNahore1.toString());
        } else if (stredniStulNahore1.isSelected()) {
            rezervaceFINALE.add(stredniStulNahore1.toString());
        }
        jmeno2 = jmeno.getText();
        email2 = email.getText();
        cas2 = cas.getText();
        datum2 = datum.getValue().toString();
if(jmeno2 != null && email2 != null && cas2 != null && datum2 != null){
    rezervaceFINALE.add(jmeno2);
    rezervaceFINALE.add(email2);
    rezervaceFINALE.add(cas2);
    rezervaceFINALE.add(datum2);
        writeToFile.write(rezervaceFINALE);

    }
    else{
    System.out.println("spatny vstupni udaje v jmeno email cas datum");
    }


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
       // System.out.println("ID vybraného stolu je :" + vybrany_stul_id);

        switch (vybrany_stul_id) {
            case "malyStul1", "malyStul2":
                velkyStul1.setVisible(false);
                velkyStul2.setVisible(false);
                velkyStul3.setVisible(false);
                velkyStul4.setVisible(false);
                velkyStul5.setVisible(false);
                velkyStul6.setVisible(false);

                velkyStul1.setDisable(true);
                velkyStul2.setDisable(true);
                velkyStul3.setDisable(true);
                velkyStul4.setDisable(true);
                velkyStul5.setDisable(true);
                velkyStul6.setDisable(true);


                stredniStulDole1.setVisible(false);
                stredniStulDole2.setVisible(false);
                stredniStulDole3.setVisible(false);
                stredniStulDole4.setVisible(false);

                stredniStulDole1.setDisable(true);
                stredniStulDole2.setDisable(true);
                stredniStulDole3.setDisable(true);
                stredniStulDole4.setDisable(true);

                stredniStulNahore1.setVisible(false);
                stredniStulNahore2.setVisible(false);
                stredniStulNahore3.setVisible(false);
                stredniStulNahore4.setVisible(false);

                stredniStulNahore1.setDisable(true);
                stredniStulNahore2.setDisable(true);
                stredniStulNahore3.setDisable(true);
                stredniStulNahore4.setDisable(true);


                break;

            case "velkyStul1", "velkyStul2", "velkyStul3", "velkyStul4", "velkyStul5", "velkyStul6":
                malyStul1.setVisible(false);
                malyStul2.setVisible(false);

                malyStul1.setDisable(false);
                malyStul2.setDisable(false);

                stredniStulDole1.setVisible(false);
                stredniStulDole2.setVisible(false);
                stredniStulDole3.setVisible(false);
                stredniStulDole4.setVisible(false);

                stredniStulDole1.setDisable(true);
                stredniStulDole2.setDisable(true);
                stredniStulDole3.setDisable(true);
                stredniStulDole4.setDisable(true);

                stredniStulNahore1.setVisible(false);
                stredniStulNahore2.setVisible(false);
                stredniStulNahore3.setVisible(false);
                stredniStulNahore4.setVisible(false);

                stredniStulNahore1.setDisable(true);
                stredniStulNahore2.setDisable(true);
                stredniStulNahore3.setDisable(true);
                stredniStulNahore4.setDisable(true);
                break;

            case "stredniStulDole1", "stredniStulDole2", "stredniStulDole3", "strednStulDole4":
                malyStul1.setVisible(false);
                malyStul2.setVisible(false);

                malyStul1.setDisable(false);
                malyStul2.setDisable(false);

                stredniStulNahore1.setVisible(false);
                stredniStulNahore2.setVisible(false);
                stredniStulNahore3.setVisible(false);
                stredniStulNahore4.setVisible(false);

                stredniStulNahore1.setDisable(true);
                stredniStulNahore2.setDisable(true);
                stredniStulNahore3.setDisable(true);
                stredniStulNahore4.setDisable(true);

                velkyStul1.setVisible(false);
                velkyStul2.setVisible(false);
                velkyStul3.setVisible(false);
                velkyStul4.setVisible(false);
                velkyStul5.setVisible(false);
                velkyStul6.setVisible(false);

                velkyStul1.setDisable(true);
                velkyStul2.setDisable(true);
                velkyStul3.setDisable(true);
                velkyStul4.setDisable(true);
                velkyStul5.setDisable(true);
                velkyStul6.setDisable(true);
                break;

            case "stredniStulNahore1", "stredniStulNahore2", "stredniStulNahore3", "stredniStulNahore4":{

                malyStul1.setVisible(false);
                malyStul2.setVisible(false);

                malyStul1.setDisable(false);
                malyStul2.setDisable(false);

                stredniStulDole1.setVisible(false);
                stredniStulDole2.setVisible(false);
                stredniStulDole3.setVisible(false);
                stredniStulDole4.setVisible(false);

                stredniStulDole1.setDisable(true);
                stredniStulDole2.setDisable(true);
                stredniStulDole3.setDisable(true);
                stredniStulDole4.setDisable(true);


                velkyStul1.setVisible(false);
                velkyStul2.setVisible(false);
                velkyStul3.setVisible(false);
                velkyStul4.setVisible(false);
                velkyStul5.setVisible(false);
                velkyStul6.setVisible(false);

                velkyStul1.setDisable(true);
                velkyStul2.setDisable(true);
                velkyStul3.setDisable(true);
                velkyStul4.setDisable(true);
                velkyStul5.setDisable(true);
                velkyStul6.setDisable(true);
                break;
            }
        }
    }
}
