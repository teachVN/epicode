package it.epicode.u5w1d4teoria.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor

public class Studente {
    @Id
    @GeneratedValue
    private int matricola;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;

    @ManyToOne
    @JoinColumn(name = "universita_id")
    private Universita universita;
}
