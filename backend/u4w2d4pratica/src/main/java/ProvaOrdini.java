import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ProvaOrdini {

    public static void main(String[] args) {
        Product p1 = new Product(1L, "Il signore degli Anelli", "Books", 101.0);
        Product p2 = new Product(2L, "Il nome della rosa", "Books", 101.0);
        Product p3 = new Product(3L, "pannolini", "Baby", 4.0);
        Product p4 = new Product(4L, "maglietta", "Baby", 7.0);
        Product p5 = new Product(5L, "carrozzina", "Baby", 70.0);
        Product p6 = new Product(6L, "scarpe", "Boys", 60.0);
        Product p7 = new Product(7L, "pantalone", "Boys", 30.0);
        Product p8 = new Product(8L, "felpa", "Boys", 30.0);

        List<Product> prodotti = List.of(p1, p2,p3,p4,p5,p6,p7,p8);

        Customer c1 = new Customer(1L, "Sara", 1);
        Customer c2 = new Customer(2L, "Roberto", 2);
        Customer c3 = new Customer(3L, "Carlo", 2);

        Order o1 = new Order(1L, "ordinato", LocalDate.of(2021, 1,1), LocalDate.of(2021, 2,1));
        Order o2 = new Order(2L, "ordinato", LocalDate.of(2021, 3,1), LocalDate.of(2021, 3,2));
        Order o3 = new Order(3L, "ordinato", LocalDate.of(2021, 3,12), LocalDate.of(2021, 3,13));

        o1.setCustomer(c1);
        o1.setProdotti(List.of(p1,p2,p3));

        o2.setCustomer(c2);
        o2.setProdotti(List.of(p4,p5,p6));

        o3.setCustomer(c2);
        o3.setProdotti(List.of(p7,p8));

        List<Order> ordini = List.of(o1, o2, o3);

        //esercizio1
        /*
        per ottenere la mappa, possiamo utilizzare il metodo groupingBy di Collectors che crea una mappa con chiave
        il campo che forniamo come input alla groupingBy e come valore una lista di oggetti collegati a quella chiave
         */
        Map<Customer, List<Order>> esercizio1 = ordini.stream().collect(Collectors.groupingBy(Order::getCustomer));

        System.out.println(esercizio1);

        System.out.println("--------------");

        //esercizio2
        /*
        per ottenere una mappa con customer e relativi totali degli ordini, utilizzo la groupingBy che ha come
        primo parametro il customer e come secondo parametro il richiamo al metodo summingDouble che sommerà
        i totali di tutti gli ordini di quel customer. SummingDouble avrà come parametro una espressione lambdache
        crea uno stream dai prodotti degli ordini e attraverso il metodo mapToDouble le calcola la somma dei prezzi
         */

        Map<Customer, Double> esercizio2 = ordini.stream().collect(Collectors.groupingBy(Order::getCustomer,
                Collectors.summingDouble(ordine->ordine.getProdotti().stream().mapToDouble(Product::getPrice).sum())));

        System.out.println(esercizio2);

        System.out.println("--------------");

        //esercizio3
        /*
        Ho applicato un filtro che va a selezionare solo i prodotti che hanno un prezzo maggiore o uguale al prezzo massimo
        dei prodotti. iL prezzo massimo dei prodotti lo ottengo creando un altro stream collegato a prodotti, dal quale
        ottengo il max.
         */

        List<Product> prodottiPrezzoMax = prodotti.stream().filter(product -> product.getPrice()==prodotti.stream().mapToDouble(Product::getPrice).max().getAsDouble()).toList();

        System.out.println(prodottiPrezzoMax);

        System.out.println("--------------");

        //esercizio4

        /*
        per ottenere la media degli importi degli ordini, faccio un mapToDouble per ottenere l'importo dei singoli ordini
        inteso come somma dei prezzi dei prodotti di un ordine. Questo porterà ad avere nello stream non più ordini ma
        importi degli ordini. Poi applico il metodo average per calcolare la media di tutti gli importi
         */
        Double media =ordini.stream().mapToDouble(ordine->ordine.getProdotti().stream().mapToDouble(Product::getPrice).sum()).average().getAsDouble();

        System.out.println(media);

        System.out.println("--------------");

        //esercizio5

        /*
        per calcolare la somma dei prezzi dei prodotti per categoria, uso il metodo groupingBy passandogli il campo
        categoria come chiave  e usando summingDouble come altro parametro per sommare i prezzi dei prodotti
         */
        Map<String, Double> esercizio5= prodotti.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.summingDouble(Product::getPrice)));

        System.out.println(esercizio5);

        //esercizio6
        try {
            salvaProdottiSuDisco(prodotti);
            leggiProdottiDaDisco().forEach(product -> System.out.println(product));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }

    public static void salvaProdottiSuDisco(List<Product> prodotti) throws IOException {
        String prodottiStringati = "";
        //con questo stream sui prodotti mappo ogni prodotto con una stringa ottenuta dai campi del prodotto
        //e poi applico allo stream di stringhe così ottenuto, una joining per unire tutte le stringhe concatenandole con #
        prodottiStringati=prodotti.stream().map(product -> {String prodottoStringato =
                product.getName()+"@"+product.getCategory()+"@"+product.getPrice();
                        return prodottoStringato;}).collect(Collectors.joining("#"));

        File file = new File("oggettiStringati.txt");

        FileUtils.writeStringToFile(file,prodottiStringati,"UTF-8", false);
    }

    public static List<Product> leggiProdottiDaDisco() throws IOException{
        File file = new File("oggettiStringati.txt");

        String prodottiStringati = FileUtils.readFileToString(file, "UTF-8");

        //con questo metodo split, divido la stringa unica ottenuta, ottenendo un array di stringhe che contiene
        //le stringhe le rappresentano un singolo prodotto
        String[] arrayProdottiStringati = prodottiStringati.split("#");

        //qui ho usato uno stream sull'array precedente. Ho usato map per associare ad ogni stringa presente nell'array
        //un oggetto di tipo Product ottenuto splittando di nuovo la stringa per @ e usando i valori presenti in questo
        // nuovo array come valori per creare un nuovo prodotto. Il toList finale crea una lista di prodotti
        return Arrays.stream(arrayProdottiStringati).map(s -> {String[] prodottoStringato = s.split("@");
            Product p = new Product(new Random().nextLong(1,101),prodottoStringato[0],prodottoStringato[1],Double.parseDouble(prodottoStringato[2]));
            return p;}).toList();
    }

}
