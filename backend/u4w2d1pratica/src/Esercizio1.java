import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
/*
il logger deve essere di slf4j e deve avere un nome. Solitamente il nome è corrispondente al nome della classe
 */
    private static Logger logger = LoggerFactory.getLogger("Esercizio1");

    public static void main(String[] args) {
        int[] numeri = new int[5];

        for (int i = 0; i < numeri.length; i++) {
            Random r = new Random(); //creo un oggetto della classe Random
            numeri[i]=r.nextInt(1,10); //vado a creare un numero randomico intero tra 1 e 10
        }

        for (int i = 0; i < numeri.length; i++) {
            System.out.println(numeri[i]);
        }

        Scanner scanner = new Scanner(System.in);

        int valore;


        do{
            valore=4;//valore fisso che non verrà mai usato se non per far ripartire il ciclo


            try {
                System.out.println("Dammi un valore");
                valore = scanner.nextInt();


                System.out.println("Dammi l'indice dell'array");
                int indice = scanner.nextInt();


                numeri[indice] = valore;
            }catch (ArrayIndexOutOfBoundsException e){
                logger.error("indice inserito oltre il limite dell'array");
                //System.out.println("indice inserito oltre il limite dell'array");
            }catch (InputMismatchException e){
                logger.error("input errato");
                //System.out.println("input errato");
                scanner.nextLine();
            }


            for (int i = 0; i < numeri.length; i++) {
                System.out.println(numeri[i]);
            }

        }while(valore!=0);


    }
}
