package com.javagda25.files_example.read.zadanie4;

// Napisz aplikację która czyta plik 'output_form.txt' i wypisuje zawartość formularzy.

import com.javagda25.files_example.write.zadanie5.Formularz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaSlow = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("katalog/output_from.txt"))) {
            String linia;

            while ((linia = reader.readLine()) != null) {
//                System.out.println(linia);
                String[] slowa = linia.split(" ");
                listaSlow.addAll(Arrays.asList(slowa));
            }
            System.out.println(listaSlow);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
