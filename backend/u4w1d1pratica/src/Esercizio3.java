import java.util.Scanner;

public class Esercizio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi la base del rettangolo");
        double b = scanner.nextDouble();

        System.out.println("Dammi l'altezza' del rettangolo");
        double h = scanner.nextDouble();

        double perimetro = perimetroRettangolo(b,h);

        System.out.println("il perimetro del rettangolo è: " + perimetro);

        System.out.println("Dammi un intero");
        int x = scanner.nextInt();

        int pd = pariDispari(x);

        System.out.println(pd);

        System.out.println("Dammi il primo lato del triangolo");
        double l1 = scanner.nextDouble();

        System.out.println("Dammi il secondo lato del triangolo");
        double l2 = scanner.nextDouble();

        System.out.println("Dammi il terzo lato del triangolo");
        double l3 = scanner.nextDouble();

        double area = areaTriangolo(l1, l2, l3);

        System.out.println("l'area del triangolo è: " + area);


    }

    public static double perimetroRettangolo(double b, double h){
        return b*2+h*2;
    }

    public static int pariDispari(int x){
        return x%2;
    }

    public static double areaTriangolo(double l1, double l2, double l3){
        double p = (l1+l2+l3)/2;

        return Math.sqrt(p*(p-l1)*(p-l2)*p-l3);
    }
}
