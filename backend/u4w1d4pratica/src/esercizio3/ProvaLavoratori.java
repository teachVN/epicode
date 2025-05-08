package esercizio3;

import esercizio1.Dipartimento;

import java.time.LocalDateTime;

public class ProvaLavoratori {

    public static void main(String[] args) {
        Lavoratore[] lavoratori = new Lavoratore[3];

        lavoratori[0]=new DipendenteFullTime(Dipartimento.VENDITE);
        lavoratori[1]=new Dirigente(Dipartimento.AMMINISTRAZIONE);
        lavoratori[2]=new Volontario("Mario", 20, "dsfsf");

        for (int i = 0; i < lavoratori.length; i++) {
            lavoratori[i].checkIn(LocalDateTime.now());
        }
    }
}
