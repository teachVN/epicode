package entities;

import enumeration.TipoStudente;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity //serve al jpa per capire che la classe deve avere una corrispondenza nel database
@Table(name = "studenti") //per dare un nome diverso alla tabella nel database rispetto al nome della classe
public class Studente {
    //@Id serve per rendere il campo primary key nella tabella corrispondente
    @Id
    /*@GeneratedValue la strategia di default è quella auto che significa che jpa valuterà automaticamente
    la migliore tecnica per l'autogenerazione della chiave primaria in base al db con cui è collegato
    La procedura in questo caso è: hibernate riceve un oggetto senza matricola, chiama la sequenza sul db,
    la sequenza risponde con una nuova chiave. Hibernate assegna questa chiave allo studente e passa questo
    studente al db per farlo memorizzare in tabella
    */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
/*
    questa strategia permette sempre l'autogenerazione della chiave primaria ma stavolta sarà tutto a cura del db.
    Cioè sarà il db che chiamerà la sequenza per l'incremento della chiave e l'inserimento nell'oggetto studente
     */
    /*@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequence")
    @SequenceGenerator(name = "sequence", initialValue = 1, allocationSize = 10)

    la strategia usata è sequence e c'è bisogno di una annotazione aggiuntiva per indicare le caratteristiche
    della sequenza come valore iniziale e incremento. Il valore dell'attributo generator in GeneratedValue
    deve essere uguale al valore name della SequenceGenerator
     */
    /*@GeneratedValue(strategy = GenerationType.TABLE, generator = "tableGen")
    @TableGenerator(name = "tableGen", initialValue = 1, allocationSize = 10)

    la chiave è generata a partire da una tabella che si chiamerà tableGen e nella quale ci sarà il valroe
    prossimo della chiave in base alle caratteristiche che abbiamo definito in TableGenerator.
    Nel GeneratedValue dobbiamo indicare il nome del generator che deve coincidere con il name di TableGenerator
     */
    private int matricola;
    //@Column può essere usato per cambiare il nome del campo nella tabella, per settare il notnull,
    //per rendere il campo unique, per settare la lunghezza del campo
    @Column(length = 20,nullable = false)
    private String nome;
    @Column(length = 20,nullable = false)
    private String cognome;
    @Column(name = "data_nascita")
    private LocalDate dataNascita;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_studente")
    private TipoStudente tipoStudente;
    @Embedded
    private LibrettoUniversitario librettoUniversitario;

    public Studente(String nome, String cognome, LocalDate dataNascita, TipoStudente tipoStudente) {
        //this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.tipoStudente = tipoStudente;
    }

    public Studente(){

    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
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

    public TipoStudente getTipoStudente() {
        return tipoStudente;
    }

    public void setTipoStudente(TipoStudente tipoStudente) {
        this.tipoStudente = tipoStudente;
    }

    public LibrettoUniversitario getLibrettoUniversitario() {
        return librettoUniversitario;
    }

    public void setLibrettoUniversitario(LibrettoUniversitario librettoUniversitario) {
        this.librettoUniversitario = librettoUniversitario;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "matricola=" + matricola +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita +
                ", tipoStudente=" + tipoStudente +
                ", librettoUniversitario=" + librettoUniversitario +
                '}';
    }
}
