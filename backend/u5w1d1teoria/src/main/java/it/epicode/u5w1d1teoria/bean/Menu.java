package it.epicode.u5w1d1teoria.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Menu {
    @Autowired
    private List<Prodotto> prodotti;

    //metodo per la stampa di tutti i prodotti del menu
}
