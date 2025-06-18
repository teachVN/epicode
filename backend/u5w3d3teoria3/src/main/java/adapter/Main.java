package adapter;

public class Main {
    public static void main(String[] args) {
        Quadrato q1 = new Quadrato(3);
        Quadrato q2 = new Quadrato(5);

        //il rettangolo non è compatibile con l'interfaccia Figura perchè discende da FiguraGEometrica
        Rettangolo r1 = new Rettangolo(5,4);

        CalcolatoreFigure calcolatoreFigure = new CalcolatoreFigure();

        FiguraGeometricaAdapter r1Adapter = new FiguraGeometricaAdapter(r1);

        calcolatoreFigure.add(q1);
        calcolatoreFigure.add(q2);
        calcolatoreFigure.add(r1Adapter);

        System.out.println(calcolatoreFigure.totalePerimetri());
        System.out.println(calcolatoreFigure.totaleAree());
    }
}
