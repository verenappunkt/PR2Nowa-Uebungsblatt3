package org.campus02.bestellung;

import java.util.ArrayList;
import java.util.HashMap;

public class Bestellung {
    private String nummer;
    private ArrayList<Bestellzeile> bestellzeilen;

    public Bestellung(String nummer) {
        this.nummer = nummer;
        this.bestellzeilen = new ArrayList<>();
    }

    public void addBestellzeile(Bestellzeile b){
        bestellzeilen.add(b);
    }

    public void printBestellung(){
        System.out.println("Bestellnummer: " + nummer);
        System.out.println("Bestellzeilen: ");

        for(Bestellzeile bz : bestellzeilen){
            System.out.println(bz);
        }
    }

    public double getKosten(){
        double sumKosten = 0;
        for(Bestellzeile bz : bestellzeilen){
            sumKosten += bz.getKosten();
        }
        return sumKosten;
    }

    public HashMap<String, Integer> getAnzahlJeProduktkategorie() {
        HashMap<String, Integer> result = new HashMap<>();

        for (Bestellzeile bz : bestellzeilen) {

            // Überprüfen, ob die Produktkategorie schon in HashMap vorhanden?
            if (result.containsKey(bz.getProduktKategorie())){
                // Ja, Produktkategorie bereits vorhanden
                Integer currentValue = result.get(bz.getProduktKategorie()); // Wert auslesen
                currentValue += bz.getMenge(); // Wert um Menge erhöhen
                result.put(bz.getProduktKategorie(), currentValue); // neuen Wert ablegen
            }
            else {
                // Produktkategorie ist noch nicht enthalten
                result.put(bz.getProduktKategorie() ,bz.getMenge());
            }
        }

        return result;
    }
}
