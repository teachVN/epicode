package esercizi_if;

import java.util.Scanner;

public class BigliettoMuseo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli un numero tra 1 e 4");
        int scelta = scanner.nextInt();

        if(scelta==1){
            System.out.println("Biglietto gratuito");
        }
        else if(scelta==2){
            System.out.println("Costo biglietto 8€");
        }
        else if(scelta==3){
            System.out.println("Costo biglietto 10€");
        }
        else if(scelta==4){
            System.out.println("Costo biglietto 15€");
        }
        else{
            System.out.println("Scelta sbagliata");
        }

    }
}
