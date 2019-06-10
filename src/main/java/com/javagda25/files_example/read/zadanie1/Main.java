package com.javagda25.files_example.read.zadanie1;

// Stwórz aplikację która służy do odczytywania danych z plików które zapisaliśmy, stwórz
// main'a w którym sprawdzaj że w katalogu w którym uruchomiłeś program jest plik o nazwie
// 'output_1.txt' który posiada treść "Hello World!". Jeśli pliku nie ma lub posiada inną
// zawartość napisz odpowiedni komunikat.

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File plik = new File("katalog/output_1.txt");
        System.out.println("Czy plik istnieje: " + plik.exists());

        if(plik.exists()) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("katalog/output_1.txt"));
                String linia;

                if ((linia = reader.readLine()).equalsIgnoreCase("Hello World!")) {
                    System.out.println("Posiada treść.");
                } else System.out.println("Nie posiada danej treści.");
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
