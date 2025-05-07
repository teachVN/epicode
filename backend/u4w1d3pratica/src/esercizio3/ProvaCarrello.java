package esercizio3;

import java.time.LocalDate;

public class ProvaCarrello {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("23432", "Roberto", "Sada",
                "email@email.it", LocalDate.of(2020,5,5));

        Articolo a1 = new Articolo("23", "matita", 0.5, 100);
        Articolo a2 = new Articolo("3", "gomma", 0.5, 100);
        Articolo a3 = new Articolo("2", "penna", 1, 100);

        Articolo[] articoli = new Articolo[3];
        articoli[0]=a1;
        articoli[1]=a2;
        articoli[2]=a3;

        Carrello carrello = new Carrello(cliente, articoli);

        System.out.println(carrello.getTotale());

    }


}
