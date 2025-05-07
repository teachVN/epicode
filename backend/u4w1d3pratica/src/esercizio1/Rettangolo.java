package esercizio1;

public class Rettangolo {

    private double altezza;
    private double base;

    public Rettangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double perimetro(){
        return 2*(altezza+base);
    }

    public double area(){
        return altezza*base;
    }


}
