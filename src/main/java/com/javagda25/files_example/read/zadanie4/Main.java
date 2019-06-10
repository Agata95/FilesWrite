package com.javagda25.files_example.read.zadanie4;

// Napisz aplikację która czyta plik 'output_form.txt' i wypisuje zawartość formularzy.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("katalog/output_form.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
