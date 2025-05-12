package ProvaStatic;

public class ProvaMath {
    public static void main(String[] args) {
        /*
        la classe Math ha solo metodi e variabili statiche quindi richiamabili
        anteponendo il nome della classe ai metodi e alle variabili
        la classe Math ha anche il costruttore private
         */
        /*
        Math math = new Math();
        non ho bisogno di creare oggetti della classe Math perchè ho tutti metodi
        statici richiamabili col solo nome della classe
         */

        /*
        PI è una variabile della classe Math public static final
        public significa che è accessibile e visibile da tutti
        static significa che è accessibile senza dover creare oggetti della classe,
        ma solo usando il nome della classe
        final significa che non è modificabile
         */
        System.out.println(Math.PI);
    }
}
