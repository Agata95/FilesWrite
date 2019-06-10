package com.javagda25.files_example.read.zadanie2;

// Stwórz aplikację która odczyta plik 'output_2.txt' i wczyta z niego linię, a następnie
// wypisze ją na ekran: 1 raz "toUpperCase", 1 raz "toLowerCase", 1 raz "trim".

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("katalog/output_2.txt"));
            String linia;
            while ((linia = reader.readLine()) != null) {
                System.out.println(linia.toUpperCase());
                System.out.println(linia.toLowerCase());
                System.out.println(linia.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
