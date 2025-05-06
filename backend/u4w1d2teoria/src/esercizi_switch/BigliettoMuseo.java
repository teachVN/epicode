package esercizi_switch;

import java.util.Scanner;

public class BigliettoMuseo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli un numero tra 1 e 4");
        int scelta = scanner.nextInt();

        switch (scelta){
            case 1:
                System.out.println("Biglietto gratuito");
                break;
            case 2:
                System.out.println("Costo biglietto 8€");
                break;
            case 3:
                System.out.println("Costo biglietto 10€");
                break;
            case 4:
                System.out.println("Costo biglietto 15€");
                break;
            default:
                System.out.println("Scelta sbagliata");
        }
    }
}
