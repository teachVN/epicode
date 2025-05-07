package esercizio1;

public class ProvaRettangolo {

    public static void main(String[] args) {

        Rettangolo r1 = new Rettangolo(4, 6);
        Rettangolo r2 = new Rettangolo(5, 9);

        stampaRettangolo(r1);
        stampaRettangolo(r2);
        stampaDueRettangoli(r1, r2);

    }

    public static void stampaRettangolo(Rettangolo rettangolo){
        System.out.println("Il perimetro del rettangolo è " + rettangolo.perimetro());
        System.out.println("L'area del rettangolo è " + rettangolo.area());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
        stampaRettangolo(r1);
        stampaRettangolo(r2);

        System.out.println("La somma dei perimetri dei 2 rettangoli è " + (r1.perimetro()+r2.perimetro()));
        System.out.println("La somma delle aree dei 2 rettangoli è " + (r1.area()+r2.area()));
    }
}
