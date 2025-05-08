package overloading;

public class Operazioni {
    /*
    esempio di overloading
    overloading è il sovraccarico dei metodi/costruttori
    si intende la possibilità di scrivere la firma dei metodi con nomi uguali
    e parametri differenti per tipo o per ordine o per numero
     */
    public double somma(int a, int b){
        return a+b;
    }

    public double somma(int a, int b, int c){ //overloading ma parametri differernti per numero
        return a+b+c;
    }

    public double somma(int b, double a){//overloading ma con parametri diff per tipo
        return a+b;
    }

    public double somma(double a, int b){//overloading con parametri con ordine diff rispetto al terzo
        return a+b;
    }
}
