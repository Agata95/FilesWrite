package com.javagda25.files_example.read.zadanie4;

// Napisz aplikację która czyta plik 'output_form.txt' i wypisuje zawartość formularzy.

import com.javagda25.files_example.write.zadanie5.Formularz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Formularz> formularzList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("formularze.txt"))) {
            String linia;
            Formularz formularz = null;

            while ((linia = reader.readLine()) != null) {
                if (linia.equals("------")) {
                    if (formularz != null) {
//                        System.out.println(formularz);
                        formularzList.add(formularz);
                    }
                    formularz = new Formularz();
                } else {
                    formularz.parsujLinie(linia);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        formularzList.forEach(System.out::println);
        System.out.println("Ilość:" + formularzList.size());
    }
}
