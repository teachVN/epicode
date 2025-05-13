package queue;

import java.util.LinkedList;

public class ProvaQueue {
    public static void main(String[] args) {
        /*
            queue hanno la caratteristica per cui il primo che entra è anche il primo ad essere estratto
         */

        LinkedList<Integer> numeri = new LinkedList<>();

        numeri.add(2);
        numeri.add(10);
        numeri.add(7);
        numeri.add(4);

        System.out.println(numeri);

        System.out.println(numeri.peek());

        System.out.println(numeri.poll());//metodo poll restituisce ed elimina il primo elemento della lista

        System.out.println(numeri.poll());

        System.out.println(numeri);
    }
}
