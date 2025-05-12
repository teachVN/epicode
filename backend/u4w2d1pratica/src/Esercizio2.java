import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi i km percorsi");
        double km = scanner.nextInt();

        System.out.println("Dammi i litri consumati");
        double litri = scanner.nextInt();

        try {
            double kmAlLitro = km / litri;

            System.out.println(kmAlLitro);
        }catch (ArithmeticException e){
            System.out.println("litri non può essere zero");
        }
        /*
        il try catch cattura l'eccezione di divisione per 0 solo se il calcolo è tra interi.
        Se il calcolo è tra double, non c'è nessuna eccezione di divisione per 0 perchè il risultato
        esiste ed è infinity
         */

    }
}
