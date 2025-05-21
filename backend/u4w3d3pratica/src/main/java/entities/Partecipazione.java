package entities;

import enumeration.Stato;
import jakarta.persistence.*;

@Entity
@Table(name = "partecipazioni")
public class Partecipazione {
    @Id
    @GeneratedValue
    private int id;
    @Enumerated(EnumType.STRING)
    private Stato stato;
    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;

    public Partecipazione(Stato stato) {
        this.stato = stato;
    }

    public Partecipazione() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", stato=" + stato +
                ", evento=" + evento +
                ", persona=" + persona +
                '}';
    }
}
