package esercizio3;

import esercizio1.Dipartimento;

public class DipendentePartTime extends Dipendente {

    private double oreLavorate;
    private double pagaOraria;

    public DipendentePartTime(Dipartimento dipartimento) {
        super(dipartimento);
    }

    public double getOreLavorate() {
        return oreLavorate;
    }

    public void setOreLavorate(double oreLavorate) {
        this.oreLavorate = oreLavorate;
    }

    public double getPagaOraria() {
        return pagaOraria;
    }

    public void setPagaOraria(double pagaOraria) {
        this.pagaOraria = pagaOraria;
    }

    @Override
    public void calculateSalary() {
        stipendio=pagaOraria*oreLavorate;
    }
}
