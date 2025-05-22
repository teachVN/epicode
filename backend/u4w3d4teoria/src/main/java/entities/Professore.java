package entities;

import jakarta.persistence.Entity;

import java.time.LocalDate;
@Entity
public class Professore extends Persona{

    private String materia;

    public Professore(String nome, String cognome, LocalDate dataNascita, String materia) {
        super(nome, cognome, dataNascita);
        this.materia = materia;
    }

    public Professore() {

    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Professore{" +
                "materia='" + materia + '\'' +
                "} " + super.toString();
    }
}
