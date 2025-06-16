package it.epicode.u5w3d1teoria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
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
