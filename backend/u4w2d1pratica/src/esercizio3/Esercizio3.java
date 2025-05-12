package esercizio3;

import java.util.Scanner;

public class Esercizio3 {

    public static void main(String[] args) {
        ContoCorrente cc = new ContoCorrente("Roberto", 100);
        ContoOnLine ccOnLine = new ContoOnLine("Sara", 100, 40);

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Dammi il valore del prelievo");
            int prelievo = scanner.nextInt();

            try {
                cc.preleva(prelievo);
            }catch (BancaException e){
                System.out.println(e.getMessage());
                break;
            }

        }

        while(true) {
            System.out.println("Dammi il valore del prelievo del conto online");
            int prelievo = scanner.nextInt();

            try {
                ccOnLine.preleva(prelievo);
            }catch (BancaException e){
                System.out.println(e.getMessage());
                break;
            }

        }
    }
}
