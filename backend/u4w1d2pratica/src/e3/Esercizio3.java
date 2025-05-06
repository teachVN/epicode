package e3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Inserisci un stringa");
        String s = scanner.nextLine();

        String sMod=""; //stringa vuota di appoggio

        while(!s.equals(":q")) {//verifico se la stringa dell'utente non è :q
            for (int i = 0; i < s.length(); i++) { //ciclo su tutta la stringa per estrarre
                                                    // un carattere alla volta e concatenarlo alla stringa di appoggio
                                                    //  insieme alla virgola
                if (i != s.length() - 1)
                    sMod = sMod + s.charAt(i) + ",";
                else {
                    sMod = sMod + s.charAt(i); //all'ultimo carattere non aggiungo la virgola
                }
            }

            System.out.println(sMod);

            sMod="";

            System.out.println("Inserisci un stringa");
            s = scanner.nextLine();
        }
    }
}
