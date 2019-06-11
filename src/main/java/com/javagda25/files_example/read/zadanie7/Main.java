package com.javagda25.files_example.read.zadanie7;

// Stwórz aplikację która pyta użytkownika o ścieżkę do pliku i (drugi raz zapytaj
// użytkownika o) wyszukiwane słowo. Następnie sprawdź czy podany plik istnieje, a jeśli
// istnieje to zlicz wystąpienia podanego słowa w pliku.

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ścieżkę do pliku:");
        String sciezka = scanner.nextLine();
        File plik = new File(sciezka);
        System.out.println("Podaj słowo, które chcesz wyszukać w pliku.");
        String slowo = scanner.next();
        System.out.println("Isnieje? " + plik.exists());
        int licznik = 0;

        List<String> listaSlow = new ArrayList<>();
        if (plik.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(sciezka))) {
                String linia;
                while ((linia = reader.readLine()) != null) {
                    String[] slowa = linia.split(" ");
                    listaSlow.addAll(Arrays.asList(slowa));
//                    System.out.println(listaSlow.size());

                }

                for (String s : listaSlow) {
                    if (listaSlow.contains(slowo)) {
                        licznik++;
                    }
                }
                System.out.println(listaSlow);
                System.out.println("Słowo: \"" + slowo + "\", występuje " + licznik + " razy.");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
