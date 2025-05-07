public class Studente {
    //variabili di istanza
    //valori di default delle variabili di istanza:
    //tipi numerici e char: 0
    //booleani: false
    //String: null
    public String nome;
    public String cognome;
    public int eta;
    public int matricola;

    //costruttore parametrizzato
    public Studente(int matricola, int eta, String nome, String cognome){
        //this si usa per far riferimento alle variabili di istanza
        //quando c'è una variabile locale omonima
        this.matricola=matricola;
        this.eta=eta;
        this.nome=nome;
        this.cognome=cognome;
    }

    public Studente(){

    }

    public void stampa(){//metodo che stampa le caratteristiche di un oggetto
        System.out.println("Nome: " + nome + ", cognome: " + cognome +
                ", matricola: " + matricola + ", eta: " + eta);
    }


}
