package ereditarieta;

public class LibriCat extends Libri{

    private String categoria;

    public LibriCat(String titolo, int anno, double costo, String categoria) {
        super(titolo, anno, costo);
        this.categoria=categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    /*
    metodo polimorfico perchè il tipo di ingresso è di tipo superclasse
    la categoria che devo confrontare non si trova nella classe Libri per cui devo
    verificare prima se l'oggetto che viene passato come parametro è di tipo libricat
    E lo faccio con instanceof. Se non è di tipo libricat allora ritorno false direttamente
    perchè nell'oggetto non ci sarà la categoria che è una caratteristica specifica dei
    libricat. Se invece l'oggetto passato è di tipo libricat allora posso fare il cast di l
    a Libricat e poi fare i confronti della categoria
     */
    public boolean stessaCategoria(Libri l){//Libri l = new LibriCat(.....)
        if(l instanceof LibriCat){
            LibriCat lc = (LibriCat)l;

            if(lc.getCategoria().equals(this.categoria)){
                return true;
            }
            return false;

        }
        return false;
    }
}
