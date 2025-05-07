package esercizio2;

public class Sim {
    private int numero;
    private double credito;
    private Chiamata[] chiamate;

    public Sim(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public Chiamata[] getChiamate() {
        return chiamate;
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    public void stampaDatiSim(){
        System.out.println("Il numero di telefono è " + numero);
        System.out.println("Il credito residuo è " + credito);

        for(int i=0; i<chiamate.length; i++){
            chiamate[i].stampa();
        }
    }
}
