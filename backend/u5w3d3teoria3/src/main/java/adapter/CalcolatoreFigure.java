package adapter;

import java.util.ArrayList;
import java.util.List;

public class CalcolatoreFigure {

    private List<Figura> figure;

    public CalcolatoreFigure() {
        this.figure = new ArrayList<>();
    }

    public void add(Figura figura){
        figure.add(figura);
    }

    public double totalePerimetri(){
        return figure.stream().mapToDouble(f->f.perimetro()).sum();
    }

    public double totaleAree(){
        return figure.stream().mapToDouble(f->f.area()).sum();
    }
}
