package com.javagda25.files_example.read.zadanie8;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("trescZadania.txt", false))){
            printWriter.println("Zadanie 8 - treść");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
