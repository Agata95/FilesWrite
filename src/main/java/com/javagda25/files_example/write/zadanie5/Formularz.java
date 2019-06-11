package com.javagda25.files_example.write.zadanie5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Formularz {
    private int wiek;
    private int wzrost;
    private boolean czyKobieta;
    private double zarobki;
    private boolean czyMaPsa;
    private int rozmiarButa;
    private String coSadziszOTymFormularzu;

    public void parsujLinie(String linia) {
        String[] elementy = linia.split("=");
        switch (elementy[0]) {
            case "wiek":
                setWiek(Integer.parseInt(elementy[1]));
                break;
            case "wzrost":
                setWzrost(Integer.parseInt(elementy[1]));
                break;
            case "czyKobieta":
                setCzyKobieta(Boolean.parseBoolean(elementy[1]));
                break;
            case "zarobki":
                setZarobki(Double.parseDouble(elementy[1]));
                break;
            case "czyMaPsa":
                setCzyMaPsa(Boolean.parseBoolean(elementy[1]));
                break;
            case "rozmiarButa":
                setRozmiarButa(Integer.parseInt(elementy[1]));
                break;
        }
    }

    public String zwrocWFormacie() {
        return "\n------\n" + "wiek=" + wiek + "\n" +
                "wzrost=" + wzrost + "\n" +
                "czyKobieta=" + czyKobieta + "\n" +
                "zarobki=" + zarobki + "\n" +
                "czyMaPsa=" + czyMaPsa + "\n" +
                "rozmiarButa=" + rozmiarButa;
    }


}
