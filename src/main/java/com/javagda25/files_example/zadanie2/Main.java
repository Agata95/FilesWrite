package com.javagda25.files_example.zadanie2;

// Napisz aplikację w której:
// - wczytaj od użytkownika jedną linię tekstu
// - po wczytaniu linii otwórz plik o nazwie 'output_2.txt'
// - zapisz do pliku linię pobraną od użytkownika
// - zamknij plik

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            PrintWriter printWriter = new PrintWriter("katalog/output_2.txt");
            printWriter.println(scanner.next());
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
