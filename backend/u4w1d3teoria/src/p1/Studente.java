package p1;

import java.util.Objects;

public class Studente {
    //variabili di istanza
    //valori di default delle variabili di istanza:
    //tipi numerici e char: 0
    //booleani: false
    //String: null
    //protected String nome;//campo visibile solo dalle classi che si trovano nello stesso package
                            // e anche dalle sottoclassi

    //String nome;//senza modificatore di accesso, java assegna quello package, quindi
                //campo visibile solo dalle classi che si trovano nello stesso package

    private String nome;//private non permette l'accesso e la visibilità all'esterno di questa classe
    private String cognome;
    private int eta;
    private int matricola;

    private Genere genere;

    //costruttore parametrizzato
    public Studente(int matricola, int eta, String nome, String cognome, Genere genere){
        //this si usa per far riferimento alle variabili di istanza
        //quando c'è una variabile locale omonima
        this.matricola=matricola;
        this.eta=eta;
        this.nome=nome;
        this.cognome=cognome;
        this.genere=genere;
    }

    public Studente(){

    }

    public void stampa(){//metodo che stampa le caratteristiche di un oggetto
        System.out.println("Nome: " + nome + ", cognome: " + cognome +
                ", matricola: " + matricola + ", eta: " + eta + ", genere: " + genere);
    }

    //per scrivere il metodo equals, fate tasto destro fuori dai metodi
    //e scegliete generate nel menu e poi equals e hashcode
    //scegliete su quali campi fare il confronto e create l'equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studente studente = (Studente) o;
        return matricola == studente.matricola;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricola);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }
}
