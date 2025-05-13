package list;

import java.util.ArrayList;
import java.util.Scanner;

public class ProvaArraylist2 {
    public static void main(String[] args) {
        /*Wrapper: sono gli analoghi dei tipi primitivi, però ad oggetti
        Byte, Short, Integer, Long, Float, Double, Character, Boolean
         */

        ArrayList<Integer> numeri = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        double somma=0;

        for (int i = 0; i < 10; i++) {//popolamento dell'arraylist
            System.out.println("Dammi un numero");
            numeri.add(scanner.nextInt());
        }

        for (Integer i:numeri) {//for avanzato per aggregare i valori dell'arraylist nella variabile somma
            somma=somma+i;
        }

        System.out.println(somma/10);

    }
}
