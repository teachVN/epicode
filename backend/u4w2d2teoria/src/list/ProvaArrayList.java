package list;

import java.util.ArrayList;

public class ProvaArrayList {

    public static void main(String[] args) {
        /*
        Arraylist è una classe concreta che discende dall'interfaccia List
        è una lista che mantiene l'ordine di inserimento ed è possibile accedere alle varie posizioni
        attraverso un indice
         */
        /*
        le parentesi angolari rappresentano la sintassi dei Generics. Servono per definire il tipo
        degli elementi che verranno contenuti nell'arraylist. Solo nomi di classi, no primitivi
         */
        ArrayList<String> squadre = new ArrayList<>();
        //size indica quanti elementi ci sono all'interno
        squadre.size();

        squadre.add("Roma");
        squadre.add("Napoli");
        squadre.add("Inter");
        squadre.add("Juventus");
        squadre.add("Lazio");

        System.out.println(squadre.size());

        squadre.remove("Inter");

        System.out.println(squadre.size());

        System.out.println(squadre.get(2));//get per estrarre un elemento ad un indice

        //squadre.clear(); //cancella tutto il contenuto dell'arraylist

        System.out.println(squadre.contains("Genoa")); //verifica se l'elemento tra parentesi è presente

        System.out.println(squadre.isEmpty()); //verifica se l'arraylist è vuoto

        squadre.set(0, "Milan"); //modifica le posizioni preesistenti

        for (int i = 0; i < squadre.size(); i++) {
            System.out.println(squadre.get(i));
        }

        System.out.println(squadre); //usa l'override del toString interno alla classe ARraylist

        for (String s:squadre){//for avanzato: si scrive dichiarando una variabile del tipo contenuto
                                //nell'arraylist:nome dell'arraylist
            System.out.println(s);
        }


    }
}
