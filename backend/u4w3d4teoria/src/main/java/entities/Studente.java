package entities;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Studente extends Persona{
    private int matricola;
    private String scuola;

    public Studente(String nome, String cognome, LocalDate dataNascita, int matricola, String scuola) {
        super(nome, cognome, dataNascita);
        this.matricola = matricola;
        this.scuola = scuola;
    }

    public Studente() {

    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String getScuola() {
        return scuola;
    }

    public void setScuola(String scuola) {
        this.scuola = scuola;
    }

    @Override
    public String toString() {
        return "Studente{" +
                super.toString()+
                "matricola=" + matricola +
                ", scuola='" + scuola + '\'' +
                '}';
    }
}
