package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "diplomi")
public class Diploma {
    @Id
    @GeneratedValue
    private int id;
    private int voto;
    private String scuola;

    private String descrizione;
    //one to one bidirezionale
//    @OneToOne(mappedBy = "diploma")
//    private Studente studente;

    public Diploma(int voto, String scuola, String descrizione) {
        //this.id = id;
        this.voto = voto;
        this.scuola = scuola;
        this.descrizione = descrizione;
    }

    public Diploma() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public String getScuola() {
        return scuola;
    }

    public void setScuola(String scuola) {
        this.scuola = scuola;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Diploma{" +
                "id=" + id +
                ", voto=" + voto +
                ", scuola='" + scuola + '\'' +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}
