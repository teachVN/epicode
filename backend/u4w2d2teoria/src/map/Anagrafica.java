package map;

import java.util.HashMap;
import java.util.Set;

public class Anagrafica {

    private HashMap<String, String> anagrafica;

    public Anagrafica() {
        anagrafica = new HashMap<>();
    }

    public void inserisciPersona(String cf, String nome){
        anagrafica.put(cf, nome);
    }

    public String estraiPersona(String cf){
        return anagrafica.get(cf);
    }

    public void rimuoviPersona(String cf){
        anagrafica.remove(cf);
    }

    public void stampaAnagrafica(){
        System.out.println(anagrafica);
    }

    public String estraiCodiceFiscale(String nome){
        Set<String> chiavi=anagrafica.keySet(); //keyset serve per estrarre un set con tutte le chiavi

        /*
        ciclo su tutte le chiavi, per ogni vado a cercare il nome associato nella mappa
        Se il nome estratto è uguale al nome che cerco, allora il cf che ho utilizzato è quello
        che cercavo
         */
        for (String cf:chiavi){
            if(anagrafica.get(cf).equals(nome)){
                return cf;
            }
        }
        return null;
    }
}
