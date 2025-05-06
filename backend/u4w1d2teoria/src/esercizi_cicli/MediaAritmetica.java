package esercizi_cicli;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somma =0;

        for (int i = 0; i < 10; i++) {
            System.out.println("dammi un numero");
            int numero = scanner.nextInt();//variabile di blocco, esiste solo nel blocco

            somma+=numero;

        }

        double media = (double)somma/10;//1 soluzione: conversione esplicita con somma int
        //double media = somma/10.0; //2 soluzione: somma int e 10 scritto come double(java converte implicitamente anche la somma in double)
        //double media = somma/10; //3 soluzione: somma double e conversione implicita di 10 in double. Risultato double


        System.out.println(media);;

        //System.out.println(numero);
    }
}
