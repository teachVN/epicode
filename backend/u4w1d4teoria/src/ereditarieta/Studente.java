package ereditarieta;

public class Studente extends Persona{ //extends permette di mettere in relazione di ereditarietà 2 classi
                         //Studente eredita tutte le caratteristiche e i metodi non private di Persona
   /*
   quando la superclasse ha costruttori non parametrizzati, questi verranno chiamati in
   automatico dal costruttore della sottoclasse
   quando la superclasse ha solo costruttori parametrizzati, allora il costruttore
   della sottoclasse deve obbligatoriamente chiamare uno parametrizzato della superclasse

    */

    private String matricola;

    public Studente(String nome, String cognome, int eta, String matricola){
        super(nome, cognome, eta);
        this.matricola=matricola;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    @Override
    public String toString() { //metodo per mostrare una rappresentazione dell'oggetto in stringa
        return  super.toString() + //super viene usato per richiamare un metodo della superclasse di cui è stato fatto l'override
                ", matricola='" + matricola + "'"
                ;
    }
}
