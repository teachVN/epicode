package composite;

import java.util.List;

public class SottoSezione implements Elemento{

    private List<Elemento> elementi;

    public SottoSezione(List<Elemento> elementi) {
        this.elementi = elementi;
    }

    @Override
    public int getPagine() {
        return elementi.stream().mapToInt(Elemento::getPagine).sum();
    }
}
