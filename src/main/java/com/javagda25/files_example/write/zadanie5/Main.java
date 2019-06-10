package com.javagda25.files_example.write.zadanie5;

// Stwórz klasę formularz. Formularz reprezentuje odpowiedzi których udzielił użytkownik.
// Aplikacja ma po uruchomieniu rozpocząć od zadawania pytań użytkownikowi. Po wpisaniu
// danych(odpowiedzi na pytania) zapisz te odpowiedzi do pliku (output_form.txt) w
// odpowiednim formacie (przez format mamy na myśli zawartość - np. oddziel pytania i
// odpowiedzi tak, aby byly pisane w nowych liniach). Poproś użytkownika o: wiek, wzrost, płeć
// (kobieta/mezczyzna), zarobki i zadaj dwa dodatkowe pytania. Po czynności zamknij plik i
// program.

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Formularz formularz = new Formularz();
        Scanner scanner = new Scanner(System.in);

        try (PrintWriter printWriter = new PrintWriter(new FileWriter("katalog/output_from.txt"))){
            System.out.println("Podaj swój wiek");
            formularz.setWiek(scanner.nextInt());

            System.out.println("Podaj swój wzrost:");
            formularz.setWzrost(scanner.nextDouble());

            System.out.println("Czy jesteś kobietą? true / false");
            formularz.setCzyKobieta(scanner.nextBoolean());

            System.out.println("Podaj swoje zarobki:");
            formularz.setZarobki(scanner.nextDouble());

            System.out.println("Czy masz kota? true / false");
            formularz.setCzyMaKota(scanner.nextBoolean());

            System.out.println("Czy studiujesz? true / false");
            formularz.setCzyStudiuje(scanner.nextBoolean());

            printWriter.println(formularz.zwrocWFormacie());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
