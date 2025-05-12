package ProvaEccezioni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProvaEccezioni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        nel caso in cui il programma non genera nessun errore allora il try catch
        sarà completamente invisibile al programma
        nel caso in cui il programma genera un errore allora entrano in gioco i
        catch che cattureranno l'eccezione specifica e la gestiranno in base al
        codice del proprio corpo.
        Il programma poi può continuare dopo i catch
         */
        try {
            System.out.println("Dammi un numero");
            int n1 = scanner.nextInt();

            System.out.println("Dammi un secondo numero");
            int n2 = scanner.nextInt();

            int risultato = n1 / n2;

            System.out.println(risultato);
        }catch (ArithmeticException e){
            System.out.println("Divisione per 0 non ammessa");
        }
        catch (InputMismatchException e){
            System.out.println("Devi inserire solo numeri interi");
        }

        System.out.println("Programma terminato");

    }
}
