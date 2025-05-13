package map;

import java.util.HashMap;

public class ProvaMap {

    public static void main(String[] args) {
        /*
        - map memorizza i dati sotto forma di coppie chiave-valore. Chiavi non hanno duplicati
        - HashMap è una classe concreta di map e non garantisce l'ordine di inserimento delle chiavi
        - LinkedHashMap è una classe concreta di map che garantisce l'ordine di inserimento delle chiavi
        - TreeMap è una classe concreta di map che ordina le chiavi secondo un ordinamento naturale
        che è alfabetico per le stringhe e crescente per i numeri
         */

        HashMap<Integer, String> classifica = new HashMap<>();

        classifica.put(1, "Napoli");//inserire una coppia nella mappa
        classifica.put(2, "Inter");
        classifica.put(3, "Atalanta");
        classifica.put(4, "Juventus");

        System.out.println(classifica);
        //il metodo get estrae il valore corrispondente alla chiave passata come parametro
        System.out.println(classifica.get(2));

        classifica.remove(2);//rimuove se c'è quella chiave
        classifica.remove(2, "Atalanta");//rimuove se c'è quella coppia

        classifica.containsKey(2); //per sapere se c'è una chiave
        classifica.containsValue("Atalanta"); //per sapere se c'è un valore
    }
}
