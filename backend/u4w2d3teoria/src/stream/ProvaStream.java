package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProvaStream {

    public static void main(String[] args) {
        //uno stream è un flusso di dati destrutturati sui quali eseguire operazioni
        //sorgente di uno stream

        Stream.of("Napoli", "Inter", "Juventus", "Milan", "Atalanta");

        ArrayList<Integer> numeri = new ArrayList<>();
        numeri.add(3);
        numeri.add(5);
        numeri.add(10);
        numeri.add(25);
        numeri.add(15);
        numeri.add(15);

        numeri.stream();//sorgente di stream da una collezione

        int[] arrayNumeri = {2,5,7,45,78,96};

        Arrays.stream(arrayNumeri); //sorgente di stream per gli array

        /*
        mi sono agganciato all'ArrayList per creare uno stream, poi gli ho applicato un filtro
        il metodo filter prende un predicate come parametro di ingresso e quindi possiamo usare
        una espressione lambda. Nell'espressione useremo un parametro di ingresso che è riconosciuto
        in automatico perchè la sorgente contiene integer e di conseguenza il parametro sarà
        in automatico un integer. Il corpo del lambda sarà una condizione
         */
        numeri.stream().filter(i->i%2==0).forEach(System.out::println);

        /*
        il metodo map mi permette di mappare ogni elemento della sorgente con un altro elemento
        che posso ottenere o da una espressione o da una corrispondenza fissa. Map ritorna uno stream
        modificato rispetto a quello sorgente
         */
        numeri.stream().map(i->2*i).forEach(System.out::println);

        System.out.println("-----------");

        //distinct elimina i duplicati nello stream
        numeri.stream().distinct().forEach(System.out::println);

        System.out.println("-----------");

        //limit viene usato per limitare il numero di elementi nello stream
        numeri.stream().limit(3).forEach(System.out::println);

        System.out.println("-----------");

        /*
        sorted ordina in maniera naturale e cioè crescente. Se vogliamo ordinare inversamente,
        dobbiamo passare a sorted un comparator e quindi possiamo usare una espressione lambda
         */
        numeri.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);

        System.out.println("-----------");

        /*
        reduce è un metodo per aggregare i dati e ottenere un risultato. Va inserito un primo
        parametro che è il valore iniziale dell'accumulatore e poi una espressione lambda per indicar3e
        il calcolo da eseguire
         */
        System.out.println(numeri.stream().reduce(0, Integer::sum));

        Stream<String> sorgente = Stream.of("Napoli", "Inter", "Juventus", "Milan", "Atalanta");

        System.out.println("-----------");

        //toList viene usato come metodo finale dello stream per trasferire il contenuto di tutto lo stream
        //in una lista
        //List<String> lista =  sorgente.filter(s -> s.contains("l") && s.contains("n")).sorted().toList();

        //System.out.println(lista);

        /*
        anyMatch è un metodo terminale che ritorna true se c'è almeno un elemento nello stream che
        verifica la condizione dell'espressione lambda, altrimenti ritorna false
         */
        //System.out.println(sorgente.map(s -> s.length()).anyMatch(integer -> integer>7));


        /*
        allMatch è un metodo terminale dello stream e torna true se tutti gli elementi dello strema
        verificano la condizione, altrimenti ritorna false
         */
        System.out.println(sorgente.map(s -> s.length()).allMatch(integer -> integer<10));
    }
}
