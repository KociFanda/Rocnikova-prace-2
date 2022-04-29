package com.example.rezervacni.system.save;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;

public class writeToFile {
    public static void write(ArrayList<String> rezervaceFINALE) throws IOException {
        FileWriter myWriter = new FileWriter("databaze.txt");
        BufferedReader br = new BufferedReader(new FileReader("databaze.txt"));



        myWriter.write(String.valueOf(rezervaceFINALE));
        myWriter.flush();
        myWriter.close();

        String vysledek;
        vysledek = br.readLine();
        System.out.println(vysledek);
        br.close();
    }
}
