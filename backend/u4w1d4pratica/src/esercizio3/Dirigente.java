package esercizio3;

import esercizio1.Dipartimento;

public class Dirigente extends Dipendente {

    public Dirigente(Dipartimento dipartimento) {
        super(dipartimento);
    }

    @Override
    public void calculateSalary() {
        stipendio=2500;
    }
}
