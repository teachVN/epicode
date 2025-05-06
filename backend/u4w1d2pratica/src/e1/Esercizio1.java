package e1;

import java.util.Scanner;

public class Esercizio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa");
        String s = scanner.nextLine();

        System.out.println(stringaPariDispari(s));

        System.out.println("Inserisci un anno");
        int anno = scanner.nextInt();

        System.out.println(annoBisestile(anno));
    }

    public static boolean stringaPariDispari(String s){
        if(s.length()%2==0){ //se la lunghezza è pari
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean annoBisestile(int anno){
        if((anno%4==0 && anno%100!=0) || (anno%100==0 && anno%400==0)){
            return true;//se l'anno è divisibile per 4 e non per 100 oppure se è divisibile per 100 e per 400
        }
        else{
            return false;
        }
    }
}
