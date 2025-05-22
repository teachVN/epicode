package entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
/*
SINGLE TABLE significa che tutte le entità padre e figli verranno convogliate in una unica tabella
con tutti i campi di tutte le entità. Inoltre verrà creato un campo discriminante dtype che conterrà
il tipo del record
 */
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

/*
con questa strategia, vengono create una tabella per ogni entità. Ma la tabella padre conterrà solo
la parte comune, mentre le tabelle figlie conterranno solo la parte specifica. Quindi per poter
recuperare i dati completi dei figli, dovremo fare per forza una join tra tabella padre e figlia
 */
//@Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Persona {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String cognome;
    @Column(name = "data_nascita")
    private LocalDate dataNascita;

    public Persona(String nome, String cognome, LocalDate dataNascita) {

        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }

    public Persona() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                '}';
    }
}
