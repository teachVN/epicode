package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;

import java.time.LocalDate;

@Entity
@NamedQuery(name = "getStudentsByScuola", query = "select s from Studente s where s.scuola=:scuola")
@NamedQuery(name = "getStudentsByScuolaIn", query = "select s from Studente s where s.scuola in(:s1,:s2,:s3)")

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
