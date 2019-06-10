package com.javagda25.files_example.read.zadanie3;

// Stwórz aplikację która czyta plik 'output_3.txt' i zlicza słowa i linie w tym pliku.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("katalog/output_3.txt"));
            String linia;
            int iloscLinii = 0;
            int iloscSlow = 0;

            List<String> listaSlow = new ArrayList<>();
            while ((linia=reader.readLine())!=null){
                System.out.println(linia);
                String[] slowa = linia.split(" ");

                listaSlow.addAll(Arrays.asList(slowa));
                iloscLinii++;
                iloscSlow+=slowa.length;
            }
            System.out.println("Ilość linii: " + iloscLinii);
            System.out.println("Ilość słów: " + listaSlow.size());

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
