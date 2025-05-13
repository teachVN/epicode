package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ProvaHashSet {

    /*
    l'interfaccia Set definisce una collezione che non può contenere duplicati e non garantisce
    l'ordine di inserimento
    HashSet è la classe concreta più diffusa che discende da Set
    HashSet non può usare gli indici
     */
    public static void main(String[] args) {
/*
set non accetta duplicati e non utilizza indici
hashset non garantisce l'ordine di inserimento e discende da set
linkedHashset mantiene l'ordine di inserimento e poi ha le stesse caratteristiche di set
treeset ordina il contenuto secondo l'ordinamento naturale crescente o alfabetico
 */


        TreeSet<String> squadre = new TreeSet<>();
        //LinkedHashSet<String> squadre = new LinkedHashSet<>();
        //HashSet<String> squadre = new HashSet<>();

        squadre.add("Napoli");
        squadre.add("Inter");
        squadre.add("Atalanta");
        squadre.add("Juventus");

        System.out.println(squadre);

        squadre.add("Napoli"); //add torna un booleano che ci dice se l'elemento è stato aggiunto
                            //o meno all'HashSet. Torna true se l'elemento non è duplicato,
                            //torna false se l'elemento è duplicato e quindi scartato

        System.out.println(squadre);

        System.out.println(squadre.size());
        System.out.println(squadre.isEmpty());
        System.out.println(squadre.contains("Juventus"));

        for(String s:squadre){
            System.out.println(s);
        }

    }
}
