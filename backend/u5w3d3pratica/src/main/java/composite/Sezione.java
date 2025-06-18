package composite;

import java.util.List;

public class Sezione implements Elemento{

    private List<Elemento> elementi;

    public Sezione(List<Elemento> elementi) {
        this.elementi = elementi;
    }

    @Override
    public int getPagine() {
        return elementi.stream().mapToInt(Elemento::getPagine).sum();
    }


}
