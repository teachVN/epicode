import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo operando");
        int o1 = scanner.nextInt();

        System.out.println("Inserisci il secondo operando");
        int o2 = scanner.nextInt();

        int m1 = moltiplica(o1, o2);

        System.out.println("Il risultato della moltiplicazione è: " +m1);
        scanner.nextLine();//scanner.nextline a vuoto per svuotare il buffer
        System.out.println("Inserisci una stringa");
        String s = scanner.nextLine();

        System.out.println("Inserisci un intero");
        int x = scanner.nextInt();

        String stringaConcatenata = concatena(s,x);

        System.out.println(stringaConcatenata);

        String[] parole = {"java", "javascript", "python", "typescript", "html"};

        String parolaDaAggiungere = "css";

        String[] parole6 = inserisciInArray(parole, parolaDaAggiungere);

        for (int i = 0; i < parole6.length; i++) {
            System.out.println(parole6[i]);
        }
    }

    public static int moltiplica(int a, int b){
        return a*b;
    }

    public static String concatena(String s, int x){
        return s+x;
    }

    public static String[] inserisciInArray(String[] parole, String s){
        String[] parole2 = new String[6];

        parole2[0]=parole[0];
        parole2[1]=parole[1];
        parole2[2]=s;
        parole2[3]=parole[2];
        parole2[4]=parole[3];
        parole2[5]=parole[4];

        return parole2;
    }
}
