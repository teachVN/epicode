import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi un numero");
        int n=scanner.nextInt();

        ArrayList<Integer> lista = metodo1(n);

        System.out.println(lista);

        System.out.println("-------------");

        System.out.println(metodo2(lista));

        System.out.println("------------");

        metodo3(lista, true);

    }

    /*
    con questo metodo popolo l'arraylist con un numero randomico tra 0 e 100
     */
    public static ArrayList<Integer> metodo1(int n){
        ArrayList<Integer> numeri = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            numeri.add(random.nextInt(0,101));
        }

        return numeri;
     }

     /*
     con questo metodo ricevo una lista e ne faccio il reverse col metodo reversed che restituisce una lista
     rovesciata. La uso per tornarla
      */
     public static List<Integer> metodo2(ArrayList<Integer> lista1){
        List<Integer> listaInvertita = new ArrayList<>();

//         for (int i = 0; i < lista1.size(); i++) {
//             listaInvertita.add(lista1.get(lista1.size()-i-1));
//         }

//         for (int i = lista1.size()-1; i >=0 ; i--) {
//             listaInvertita.add(lista1.get(i));
//         }

         listaInvertita=lista1.reversed();

         return listaInvertita;
     }


     public static void metodo3(ArrayList<Integer> lista, boolean b){
        if (b){
            for (int i = 0; i < lista.size(); i=i+2) {//mi muovo solo sulle posizioni pari
                System.out.println(lista.get(i));
            }
        }
        else{
            for (int i = 1; i < lista.size(); i=i+2) {//mi muovo solo sulle posizioni dispari
                System.out.println(lista.get(i));
            }
        }
     }
}
