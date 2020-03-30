package org.campus02.bestellung;

public class DemoShopApp {
    public static void main(String[] args) {

        Bestellung order12 = new Bestellung("AT-1234");
        order12.addBestellzeile(new Bestellzeile("Coca Cola", 2, "Lebensmittel", 15));
        order12.addBestellzeile(new Bestellzeile("Hammer", 1, "Werkzeug", 29));
        order12.addBestellzeile(new Bestellzeile("Chips", 1 , "Lebensmittel", 3.9));

        order12.printBestellung();
        System.out.println("order12.getKosten() = " + order12.getKosten());

        System.out.println("order12.getAnzahlJeProduktkategorie() = " + order12.getAnzahlJeProduktkategorie());
    }
}
