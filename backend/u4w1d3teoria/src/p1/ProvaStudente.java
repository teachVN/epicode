package p1;

import p1.Genere;
import p1.Studente;

public class ProvaStudente {

    public static void main(String[] args) {
        //s1 variabile di riferimento, contiene l'indirizzo di memoria
        //dell'oggetto a cui si riferiscono
        Studente s1 = new Studente(1,20,"Mario","Rossi", Genere.UOMO);//p1.Studente() è il costruttore di default
        s1.setEta(18);

        s1.stampa(); // richiama il metodo stampa della classe studente
        // i valori delle variabili di istanza nell'oggetto sono tutti
        // di default perchè non li abbiamo valorizzati

        Studente s2 = new Studente();
        s2.setMatricola(10);

        s2.stampa();

        System.out.println(s1==s2);

        s1=null; //java va a cancellare il riferimento all'oggetto.
                //l'oggetto non è più raggiungibile e il garbage collector
                //va a cancellare l'oggetto in memoria, perchè non più referenziato
                // da nessuno

        //s1.stampa();//Nullpointerexception si ha ogni qualvolta cerco di
                    //accedere ad un oggetto non più collegato alla variabile di riferimento

        s1=s2; //sto copiando in s1 il riferimento presente in s2
        //quindi punteranno allo stesso oggetto

        s1.stampa();

        s1.setNome("Maria"); ;

        s2.stampa();

        System.out.println(s1==s2);//== confronta solo gli indirizzi di memoria
                                    //a cui sono collegate le 2 variabili

        s1 = new Studente();
        s1.setNome("Maria");;
        s1.setMatricola(10);;
        s1.stampa();

        System.out.println(s1==s2);

        System.out.println(s1.equals(s2)); //equals di default funziona come ==
        //facendo l'override dell'equals ora il confronto viene fatto sulle matricole

    }
}
