import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {

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
                System.out.println("indice inserito oltre il limite dell'array");
            }catch (InputMismatchException e){
                System.out.println("input errato");
                scanner.nextLine();
            }


            for (int i = 0; i < numeri.length; i++) {
                System.out.println(numeri[i]);
            }

        }while(valore!=0);


    }
}
