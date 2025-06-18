package composite;

import java.util.List;

public class Libro implements Elemento{

    private double prezzo;
    private List<String> autori;
    private List<Elemento> elementi;
    private String titolo;

    public Libro(double prezzo, List<String> autori, List<Elemento> elementi , String titolo) {
        this.prezzo = prezzo;
        this.autori = autori;
        this.elementi = elementi;
        this.titolo=titolo;
    }

    @Override
    public int getPagine() {
        return elementi.stream().mapToInt(Elemento::getPagine).sum();
    }
}
