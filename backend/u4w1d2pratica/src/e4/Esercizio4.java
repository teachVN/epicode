package e4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Inserisci un numero");
        int numero = scanner.nextInt();

        for(int i=numero; i>=0; i--){//parto dal numero fornito dall'utente
                                    // e fino a quando la i è maggiore o uguale a 0,
                                    //      decremento la i
            System.out.println(i);
        }
    }
}
