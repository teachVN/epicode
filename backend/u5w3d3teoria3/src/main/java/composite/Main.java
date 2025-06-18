package composite;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Prodotto> prodotti = new ArrayList<>();

        prodotti.add(new Libro("La pietra filosofale", 10, 400));
        prodotti.add(new Libro("Terminator", 9, 500));

        Libreria libreria = new Libreria("San Marco");
        libreria.add(new Libro("Il nome della rosa", 8, 500));
        libreria.add(new Libro("I promessi sposi", 10, 700));

        prodotti.add(libreria);

        System.out.println(prodotti.stream().mapToDouble(Prodotto::getPrezzo).sum());

        System.out.println(prodotti.stream().mapToDouble(Prodotto::getPeso).sum());
    }
}
