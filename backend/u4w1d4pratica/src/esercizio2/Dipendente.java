package esercizio2;

import esercizio1.Dipartimento;

import java.util.Random;

public abstract class Dipendente {

    private int matricola;
    protected double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(Dipartimento dipartimento) {
        Random generatore = new Random();
        matricola = generatore.nextInt(1, 2000000);
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento +
                '}';
    }

    public abstract void calculateSalary();
}
