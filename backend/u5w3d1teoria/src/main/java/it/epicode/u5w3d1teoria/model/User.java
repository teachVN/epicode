package it.epicode.u5w3d1teoria.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String cognome;
    @Column(unique = true) //creerà il campo username univoco sul db, cioè non potrà avere duplicati
    private String username;
    private String password;
}
