public class ProvaStudente {

    public static void main(String[] args) {
        //s1 variabile di riferimento, contiene l'indirizzo di memoria
        //dell'oggetto a cui si riferiscono
        Studente s1 = new Studente(1,20,"Mario","Rossi");//Studente() è il costruttore di default
        s1.eta=18;

        s1.stampa(); // richiama il metodo stampa della classe studente
        // i valori delle variabili di istanza nell'oggetto sono tutti
        // di default perchè non li abbiamo valorizzati

        Studente s2 = new Studente();
        s2.matricola=10;

        s2.stampa();

        s1=null; //java va a cancellare il riferimento all'oggetto.
                //l'oggetto non è più raggiungibile e il garbage collector
                //va a cancellare l'oggetto in memoria, perchè non più referenziato
                // da nessuno
    }
}
