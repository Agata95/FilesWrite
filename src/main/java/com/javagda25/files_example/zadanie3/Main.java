package com.javagda25.files_example.zadanie3;

// Należy napisać aplikację która w pętli while czyta ze Scannera wejście użytkownika z
// konsoli, a następnie linia po linii wypisuje tekst do pliku 'output_3.txt'. Aplikacja ma się
// zamykać po wpisaniu przez użytkownika komendy "quit".

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (PrintWriter printWriter = new PrintWriter(new FileWriter("output_3.txt", false))){
            String komenda = scanner.nextLine();

            while (!komenda.equalsIgnoreCase("quit")){
                printWriter.println(komenda);
                komenda = scanner.nextLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
