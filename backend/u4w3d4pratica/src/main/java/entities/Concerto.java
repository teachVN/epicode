package entities;

import enumeration.Genere;
import enumeration.TipoEvento;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "concerti")
public class Concerto extends Evento{
    @Enumerated(EnumType.STRING)
    private Genere genere;
    @Column(name = "in_streaming")
    private boolean inStreaming;

    public Concerto(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMaxPartecipanti, Genere genere, boolean inStreaming) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMaxPartecipanti);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

    public Concerto() {

    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", inStreaming=" + inStreaming +
                "} " + super.toString();
    }
}
