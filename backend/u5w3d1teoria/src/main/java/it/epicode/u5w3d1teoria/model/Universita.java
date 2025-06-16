package it.epicode.u5w3d1teoria.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Universita {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String citta;

    @JsonIgnore//ignora la generazione del json per la lista
    @OneToMany(mappedBy = "universita")
    private List<Studente> studenti;
}
