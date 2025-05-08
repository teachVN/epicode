package esercizio2;

import esercizio1.Dipartimento;

public class ProvaDipendenti {

    public static void main(String[] args) {
        /*
        creo un array di tipo Dipendente in maniera tale da poter
        metterci all'interno tutti i tipi di Dipendenti
         */

        Dipendente[] dipendenti = new Dipendente[3];

        dipendenti[0]=new DipendenteFullTime(Dipartimento.VENDITE);
        dipendenti[1]=new Dirigente(Dipartimento.AMMINISTRAZIONE);

        DipendentePartTime dPart=new DipendentePartTime(Dipartimento.PRODUZIONE);
        dPart.setPagaOraria(10);
        dPart.setOreLavorate(100);

        dipendenti[2]=dPart;

        for (int i = 0; i < dipendenti.length; i++) {
            dipendenti[i].calculateSalary(); /*
            java sceglie il metodo calculatesalary da eseguire in base
            all'oggetto che trova nelle varie posizioni dell'array.
            utilizzando il binding. Java si accorge dell'oggetto all'interno
            dell'array solo in fase di esecuzione
            */

            System.out.println(dipendenti[i].getStipendio());
        }
    }
}
