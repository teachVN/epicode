package esercizi_cicli;

import java.util.Scanner;

public class Cerca {
    public static void main(String[] args) {
        int[] numeri = {2,8,9,4,15,16,2,10,3,85};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi un numero");
        int n = scanner.nextInt();

        for (int i = 0; i < numeri.length; i++) {
            if(numeri[i]==n){
                System.out.println("Presente");
                return;
            }

        }

        System.out.println("Assente");


    }
}
