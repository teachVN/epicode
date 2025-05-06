package esercizi_cicli;

import java.util.Scanner;

public class MediaWhile {
    public static void main(String[] args) {
        int somma = 0;
        int cont = 0;

        Scanner scanner = new Scanner(System.in);
        //esercizio con il while
//        System.out.println("Dammi un numero");
//        int numero = scanner.nextInt();
//
//        while(numero!=0){
//            somma+=numero;
//            cont++;
//
//            System.out.println("Dammi un numero");
//            numero = scanner.nextInt();
//        }

        //esercizio con il do while
        int numero;

        do{
            System.out.println("Dammi un numero");
            numero = scanner.nextInt();

            somma+=numero;
            cont++;
        }while(numero!=0);

        //Math.floor permette di troncare un numero con la virgola
        //se abbiamo bisogno di solo 2 cifre dopo la virgola allora
        //prima di usare math.floor va moltiplicato il numero da troncare per 100
        //quindi 6.3333333333333333 diventerebbe 633.3333333333
        //applicando il Math.floor al numero, diventerebbe 633
        //Dividendo poi il tutto per 100, si otterrebbe 6.33
        double media = Math.floor(((double)somma/(cont-1))*100)/100;

        System.out.println(media);
    }
}
