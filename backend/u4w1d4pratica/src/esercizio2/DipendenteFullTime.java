package esercizio2;

import esercizio1.Dipartimento;

public class DipendenteFullTime extends Dipendente{

    public DipendenteFullTime(Dipartimento dipartimento) {
        super(dipartimento);
    }

    @Override
    public void calculateSalary() {
        stipendio=1700;
    }
}
