package it.epicode.u5w1d1teoria.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Prodotto {

    private String nome;
    private double prezzo;
    private int calorie;
}
