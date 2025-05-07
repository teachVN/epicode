package esercizio2;

public class Chiamata {

    private int numeroChiamato;
    private int durata;

    public Chiamata(int numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }

    public int getNumeroChiamato() {
        return numeroChiamato;
    }

    public void setNumeroChiamato(int numeroChiamato) {
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void stampa(){
        System.out.println("numeroChiamato=" + numeroChiamato +
                ", durata=" + durata);
    }


}
