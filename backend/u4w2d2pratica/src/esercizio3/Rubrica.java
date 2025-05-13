package esercizio3;

import java.util.HashMap;
import java.util.Set;

public class Rubrica {

    private HashMap<String, String> rubrica;

    public Rubrica(){
        rubrica=new HashMap<>();
    }

    /*
    questo metodo serve per inserire una coppia nome - numero nella mappa
     */
    public void inserisciContatto(String nome, String numero){
        rubrica.put(nome, numero);
    }

    //questo metodo permette di rimuovere dalla mappa una coppia con il nome passato come parametro
    public void rimuoviContatto(String nome){
        rubrica.remove(nome);
    }

    /*
    questo metodo contiene un algoritmo per estrarre il nome della persona che ha quel numero
    esistono anche altri algoritmi per farlo
    questo algoritmo usa il metodo keyset che estrae della mappa tutte le chiavi che sono rappresentate dai nomi
     le chiavi estratte si trovano in un set. Ciclando questo set, si estrae una chiave alla volta e la si usa
     per estrarre il numero associato nella rubrica. Se questo numero è uguale al numero cercato, allora il nome
     è quello associato
     */
    public String cercaContattoPerNumero(String numero){
        Set<String> nomi = rubrica.keySet();

        for (String nome: nomi){
            if(rubrica.get(nome).equals(numero)){
                return nome;
            }
        }
        return null;
    }

    public String cercaContattoPerNome(String nome){
        return rubrica.get(nome);
    }

    public void stampaContatti(){
        System.out.println(rubrica);
    }
}
