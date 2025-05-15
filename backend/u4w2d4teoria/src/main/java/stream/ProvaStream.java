package stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ProvaStream {
    public static void main(String[] args) {
        Product p1 = new Product(1L, "Il signore degli Anelli", "Books", 10.0);
        Product p2 = new Product(2L, "Il nome della rosa", "Books", 101.0);
        Product p3 = new Product(3L, "pannolini", "Baby", 4.0);
        Product p4 = new Product(4L, "maglietta", "Baby", 7.0);
        Product p5 = new Product(5L, "carrozzina", "Baby", 70.0);
        Product p6 = new Product(6L, "scarpe", "Boys", 60.0);
        Product p7 = new Product(7L, "pantalone", "Boys", 30.0);
        Product p8 = new Product(8L, "felpa", "Boys", 30.0);
        //Product p9 = new Product(8L, "felpa", "Boys", 30.0);

        List<Product> prodotti = List.of(p1,p2,p3,p4,p5,p6,p7,p8);

        //lista di prezzi dei prodotti

        List<Double> l1 = prodotti.stream().map(product -> product.getPrice()).collect(Collectors.toList());

        System.out.println(l1);

        System.out.println("---------------");
        //set di prezzi dei prodotti
        Set<Double> l2 = prodotti.stream().map(product -> product.getPrice()).collect(Collectors.toSet());

        System.out.println(l2);

        System.out.println("---------------");
        /*il Set per definire uguali 2 oggetti va a chiamare il metodo equals su ogni oggetto che voglio
        inserire all'interno del Set. Se la classe dell'oggetto non ha un suo equals, java va a prendere
        quello di Object che distingue un oggetto da un altro solo per l'indirizzo di memoria. Quindi i 2 oggetti
        anche se hanno dati uguali ma indirizzi diversi, verranno considerati diversi.
        Se invece voglio considerarli uguali solo per i dati che hanno all'interno, devo fare l'override
        del metodo equals nella classe degli oggetti che inserisco nel Set e java chiamerà questo equals
        quando verrà inserito un nuovo oggetto nel Set
        */
        Set<Product> l3 = prodotti.stream().collect(Collectors.toSet());

        System.out.println(l3);

        System.out.println("---------------");

        //voglio creare una mappa con nome del prodotto e relativo prezzo
        /*
        se voglio creare una mappa da uno stream, devo indicare al metodo toMap, quale campo sarà chiave e
        quale campo sarà valore. Il campo chiave non deve avere duplicati altrimenti lo stream andrà in errore
         */
        Map<String,Double> l4 = prodotti.stream().collect(Collectors.toMap(Product::getName, product -> product.getPrice()));

        System.out.println(l4);

        System.out.println("---------------");

        //una mappa delle categorie e ad ogni categoria, la lista dei prodotti associati
        /*
        la groupingby mi permette di raggruppare i prodotti nello stream in base ad una caratteristica. In questo
        caso abbiamo raggruppato per categoria. goupingby crea una mappa con chiave categoria e valori dati
        dalla lista di prodotti di quella categoria
         */
        Map<String, List<Product>> l5 = prodotti.stream().collect(Collectors.groupingBy(Product::getCategory));

        System.out.println(l5);

        System.out.println("---------------");

        //per ogni categoria, il conteggio dei prodotti di quella categoria
        /*
        la grouping by può prendere anche un secondo parametro che indica cosa voglio come valori. In questo caso
        sono interessato a contare gli elementi che fanno parte di quella categoria e quindi uso Collectors.counting
         */
        Map<String, Long> l6 =prodotti.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.counting()));

        System.out.println(l6);
    }

}
