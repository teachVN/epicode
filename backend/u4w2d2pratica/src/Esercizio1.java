import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Esercizio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi la quantità di stringhe");
        int n = scanner.nextInt();
        scanner.nextLine();

        HashSet<String> parole = new HashSet<>();
        //paroleDuplicate conterrà tutte le parole scartate dall'Hashset perchè duplicate
        ArrayList<String> paroleDuplicate = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Dammi una stringa");
            String p = scanner.nextLine();
            //inserisco le parole nell'hashset, ma se l'hashset le scarta, verranno inserite nell'arraylist
            //il metodo add torna un boolean. Se è true vuol dire che ha inserito la parola
            //se è false non ha inserito la parola perchè duplicata e l'if aggiunge la parola all'arraylist
            if(!parole.add(p)){
                paroleDuplicate.add(p);
            }
        }

        System.out.println("Le parole duplicate sono: " + paroleDuplicate);
        System.out.println("La quantità di parole non duplicate è: " + parole.size());
        System.out.println("Le parole non duplicate sono: " + parole);


    }
}
