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

public class PrehledController {

    public TextArea prehledVypis;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void initialize() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("databaze.txt"));
        String vypis = " ";
        if (br.readLine() != null){vypis = br.readLine();}
        else{vypis =" "; }
        if (vypis == null){
            vypis = "zadna data ";
        }
        String vypis2 = vypis.replace("[", "");
        String vypis3 = vypis2.replace("]", "");
        String vypis4 = vypis3.replace(",", "");
        prehledVypis.setText("Rezervace: " + vypis4 + "\n");
/*
        String[]KONECNYvypis = vypis4.split(" ");

        String misto1;
        String misto2;
        String misto3;
        String misto4;
        String misto5;
        String misto6;

        if(KONECNYvypis[1].contains("stul")){
             misto1 = KONECNYvypis[1];
        }
        else{
            misto1="";
        }
        //
        if(KONECNYvypis[2].contains("stul")){
             misto2 = KONECNYvypis[2];
        }
        else{
            misto2="";
        }
        //
        if(KONECNYvypis[3].contains("stul")){
            misto3 = KONECNYvypis[3];
        }
        else{
            misto3="";
        }
        //
        if(KONECNYvypis[4].contains("stul")){
             misto4= KONECNYvypis[4];
        }
        else{
            misto4="";
        }
        //
        if(KONECNYvypis[5].contains("stul")){
             misto5 = KONECNYvypis[5];
        }
        else{
            misto5="";
        }
        //
        if(KONECNYvypis[6].contains("stul")){
             misto6 = KONECNYvypis[6];
        }
        else{
            misto6="";
        }



        System.out.println(vypis4);

        prehledVypis.setText(
                "Rezervovaná místa:" + misto1 + "," + misto2 + "," + misto3 + "," + misto4 + "," + misto5 + "," + misto6 +
                        "Jmeno"
        );
*/

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
