package esercizio1;

public class ProvaDipendente {
    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[3];
        dipendenti[0]= new Dipendente(Dipartimento.VENDITE);
        dipendenti[1]= new Dipendente(Dipartimento.AMMINISTRAZIONE);
        dipendenti[2]= new Dipendente(Dipartimento.PRODUZIONE);

        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println(dipendenti[i].getMatricola());
        }
    }
}
