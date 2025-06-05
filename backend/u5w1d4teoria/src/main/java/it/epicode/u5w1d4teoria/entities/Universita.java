package it.epicode.u5w1d4teoria.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString(exclude = "studenti")//questa annotazione serve per escludere dal toString la lista degli studenti
//@Component
public class Universita {
    @Id
    @GeneratedValue
    private int id;
    private String nome="UNISA";
    private String citta="Salerno";

    //@Autowired
    @OneToMany(mappedBy = "universita")
    private List<Studente> studenti;
}
