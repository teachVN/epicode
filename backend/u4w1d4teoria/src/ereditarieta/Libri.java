package ereditarieta;

public class Libri {

    private String titolo;
    private int anno;
    private double costo;

    public Libri(String titolo, int anno, double costo) {
        this.titolo = titolo;
        this.anno = anno;
        this.costo = costo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "titolo='" + titolo + '\'' +
                ", anno=" + anno +
                ", costo=" + costo +
                '}';
    }

    /*metodo polimorfico perchè prende come parametro di ingresso una variabile di tipo
    superclasse e quindi potrò passargli qualsiasi oggetto di tipo sottoclasse
     */
    public boolean stessoCosto(Libri l){
        if(l.getCosto()==costo){
            return true;
        }
        return false;
    }
}
