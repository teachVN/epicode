import java.util.Scanner;

public class Variabili {

    //main è il metodo che serve per eseguire una classe
    public static void main(String[] args) {

        int x; //dichiarazione di una variabile

        x=8;//assegnazione di un valore a variabile

        System.out.println(x); //stampa in console scrivendo sout e invio

        int y=4;//dichiarazione e assegnazione in contemporanea

        System.out.println(y);

        y=3;

        float w=4;

        System.out.println(w);

        boolean b = true;

        char c = '.';//variabile di tipo char che può contenere solo un carattere

        String s = "benvenuti al corso backend";//per le stringhe doppi apici

        s = s + " epicode";

        System.out.println(s);

        System.out.println(s.length());//length metodo per conoscere la lunghezza
                                    // di una stringa

        final int j =8; // final sta per costante

        int[] numeri;

        numeri = new int[4];

        System.out.println(numeri);

        numeri[0]=7;

        numeri[3]=9;

        String[] parole = {"java", "javascript", "python"};

        parole[0]="html";

        int i= 3;

        i=i+1;

        System.out.println(i);

        i++; //post incremento

        System.out.println(i);

        ++i; //pre incremento

        System.out.println(i);

        System.out.println(++i);

        System.out.println(i++);

        System.out.println(i);

        //conversione implicita: tipo più piccolo a tipo più grande

        byte v = 4;

        int k = 100;

        byte z = (byte)k; //conversione esplicita

        System.out.println(z);

        //System.out.println(s==v);

        Scanner scanner = new Scanner(System.in);

        System.out.println("dammi un numero");

        int a1 = scanner.nextInt();

        System.out.println("dammi un secondo numero");

        int a2 = scanner.nextInt();

        somma(a1,a2);

    }

    //metodo void non restituisce nulla
    public static void somma(int a, int b){
        System.out.println(a+b);
    }
}
