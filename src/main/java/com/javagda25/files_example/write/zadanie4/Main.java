package com.javagda25.files_example.write.zadanie4;

// Napisz program, a w tym programie wczytaj jedną linię ze skanera od użytkownika.
// Poproś użytkownika o 'adres pliku'. Po wpisaniu zweryfikuj czy wybrany plik/katalog istnieje,
// czy jest plikiem/katalogiem, jaki jest jego: rozmiar, czas ostatniej modyfikacji i czy mamy
// prawa do odczytu/zapisu do tego pliku/katalogu.

import java.io.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres pliku:");
        String adresPliku = scanner.nextLine();
        File plik = new File(adresPliku);
        System.out.println("Czy plik/katalog istnieje: " + plik.exists());
        System.out.println("Czy plik jest katalogiem: " + plik.isDirectory());
        System.out.println("Rozmiar pliku: " + plik.length());

        // zamiana Long na Time

        Timestamp timestamp = new Timestamp(plik.lastModified());
        LocalDateTime localDateTime = LocalDateTime.from(timestamp.toLocalDateTime());
        System.out.println("Czas ostatniej modyfikacji: " + localDateTime);
        System.out.println("Prawa do odczytu: " + plik.canRead());


    }
}
