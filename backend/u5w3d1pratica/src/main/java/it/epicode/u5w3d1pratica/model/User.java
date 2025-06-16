package it.epicode.u5w3d1pratica.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String cognome;
    @Column(unique = true)
    private String email;
    private String password;
}
