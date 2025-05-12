package ProvaStatic;

public class Counter {
    /*il modificatore static trasforma la variabile di istanza in una variabile
    di classe. Significa che il valore della variabile non sarà più indipendente
    da oggetto ad oggetto, ma sarà comune a tutti gli oggetti di quella class
     */
    private static int contatore;

    public Counter(){ //quando verrà chiamato per creare un oggetto, andrà a
                        //incrementare la variabile contatore
        contatore++;
    }
    /*un metodo static è un metodo che può essere richiamato senza dover creare un
    oggetto della classe, ma il metodo può essere richiamato direttamente usando
    il nome della classe.metodo

     */
    public static int getContatore(){
        return contatore;
    }
}
