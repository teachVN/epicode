package esercizio2;

public class ProvaSim {
    public static void main(String[] args) {
        Sim sim = new Sim(232322232);
        sim.setCredito(10);

        Chiamata[] chiamate = new Chiamata[5];
        Chiamata c1 = new Chiamata(347834234, 1);
        Chiamata c2 = new Chiamata(265645121, 2);
        Chiamata c3 = new Chiamata(842164587, 3);
        Chiamata c4 = new Chiamata(999558658, 4);
        Chiamata c5 = new Chiamata(333562486, 5);

        chiamate[0]=c1;
        chiamate[1]=c2;
        chiamate[2]=c3;
        chiamate[3]=c4;
        chiamate[4]=c5;

        sim.setChiamate(chiamate);

        sim.stampaDatiSim();

    }
}
