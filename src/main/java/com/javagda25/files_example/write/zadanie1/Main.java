package com.javagda25.files_example.write.zadanie1;

// Napisz aplikację która otwiera plik 'output_1.txt', zapisuje do niego "Hello World!" a
// następnie zamyka plik.

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter("katalog/output_1.txt");

            printWriter.println("Hello World!");

            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
