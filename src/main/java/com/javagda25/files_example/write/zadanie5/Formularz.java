package com.javagda25.files_example.write.zadanie5;

import lombok.Data;

@Data


public class Formularz {
    private int wiek;
    private double wzrost;
    private boolean czyKobieta;
    private double zarobki;
    private boolean czyMaKota;
    private boolean czyStudiuje;


    public String zwrocWFormacie() {
        return "wiek = " + wiek + "'\n" +
                "wzrost = " + wzrost + "'\n" +
                "czy Kobieta = " + czyKobieta + "'\n" +
                "zarobki = " + zarobki + "'\n" +
                "czy ma kota = " + czyMaKota + "'\n" +
                "czy studiuje = " + czyStudiuje;
    }
}
