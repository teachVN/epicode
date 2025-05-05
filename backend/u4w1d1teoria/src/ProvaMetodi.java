public class ProvaMetodi {

    public static void main(String[] args) {
        System.out.println(somma(5,6)); ;

        double d = somma(5,6);

        System.out.println(d);

        int[] numeri = {2,5,8,9};

        int somma = somma(numeri);

        System.out.println(somma);

    }

    public static double somma(double a, double b){
        return a+b;
    }

    public static int somma(int[] numeri){
        return numeri[0]+numeri[1] +numeri[2]+numeri[3];
    }

}
