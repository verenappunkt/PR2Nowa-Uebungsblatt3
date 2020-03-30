package org.campus02.bestellung;

public class Bestellzeile {
    private String name;
    private int menge;
    private String produktKategorie;
    private double preis;

    public Bestellzeile(String name, int menge, String produktKategorie, double preis) {
        this.name = name;
        this.menge = menge;
        this.produktKategorie = produktKategorie;
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Bestellzeile{" +
                "name='" + name + '\'' +
                ", menge=" + menge +
                ", produktKategorie='" + produktKategorie + '\'' +
                ", preis=" + preis +
                '}';
    }

    public double getKosten(){
        return preis * menge;
    }

    public String getName() {
        return name;
    }

    public int getMenge() {
        return menge;
    }

    public String getProduktKategorie() {
        return produktKategorie;
    }

    public double getPreis() {
        return preis;
    }
}
