package com.example.rezervacni.system.Save;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class writeToFile {
    public static void write(ArrayList<String> rezervaceFINALE) throws IOException {

        File file = new File("src/main/java/com/example/rezervacni/system/Save/Databaze.txt");
        FileWriter zapisovac = new FileWriter(file);
        System.out.println("TEST");
        zapisovac.write("AHOJ");
        for (int i = 0; i < rezervaceFINALE.toArray().length ; i++) {
            zapisovac.write("AHOJ");
            zapisovac.write(String.valueOf(rezervaceFINALE));

        }
    }
}
