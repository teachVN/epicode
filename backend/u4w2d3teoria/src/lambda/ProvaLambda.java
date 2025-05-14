package lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class ProvaLambda {

    public static void main(String[] args) {

        /*
        il treeset non sa ordinare di suo, ma va a leggere un metodo che sta all'interno delle classi
        che gli dice come ordinare. String e Wrapper hanno già al loro interno l'override di un metodo
        che viene letto dal treeset per sapere come ordinarli.

        Se invece vogliamo ordinare in altro modo oppure vogliamo ordinare oggetti più complessi
        dobbiamo usare un altro costruttore del treeset che prende un oggetto che discende dall'interfaccia
        Comparator per indicargli come ordinare gli oggetti
         */

        /*
        il Comparator è una interfaccia funzionale che significa che ha un solo metodo astratto
         */
        /*
        in questo caso abbiamo usato una classe anonima come parametro di ingresso del costruttore
        del treeset. Una classe anonima è una classe che non viene dichiarata, quindi senza nome
        ma nel punto in cui la creiamo ne implementiamo anche il metodo astratto
         */
//        TreeSet<String> squadre = new TreeSet<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1); //ordinamento alfabetico inverso
//                /*
//                compareTo ritorna un numero negativo se o1 viene prima di o2
//                ritorna 0 se sono perfettamente uguali
//                ritorna un numero positivo se o2 viene prima di o1
//                 */
//            }
//        });
        //treeset usando l'espressione lambda per dare la definizione del metodo compare del comparator
        TreeSet<String> squadre = new TreeSet<>((o1, o2) -> o2.compareTo(o1));

        squadre.add("Napoli");
        squadre.add("Juventus");
        squadre.add("Inter");
        squadre.add("Milan");

        System.out.println(squadre);

        //esempio di implementazione del Consumer che è parametro di ingresso del foreach
        //il Consumer ha un metodo astratto che prende un parametro e non restituisce nulla
        //noi lo abbiamo implementato con una espression lambda prende una stringa alla volta e la stmpa
        squadre.forEach(s -> System.out.println(s));

        /*
        il removeIf rimuove tutti gli elementi che verificano una certa condizione
        removeIf prende un Predicate come parametro di ingresso. Il predicate ha un metodo astratto
        che prende un parametro di ingresso e restituisce un booleano.
        Con l'espressione lambda andiamo a implementare questo metodo.
        Il parametro di ingresso è una stringa e il corpo è la condizione sulla lunghezza della strtinga
         */
        squadre.removeIf(s -> s.length()>5);

        squadre.forEach(System.out::println);//reference method in sostituzione dell'espressione lambda
        //si scrive Nome della classe :: nome del metodo. Si può usare in alcuni casi, quando c'è un solo
        //parametro e poi se nel corpo c'è l'utilizzo di un metodo senza condizioni


    }
}
