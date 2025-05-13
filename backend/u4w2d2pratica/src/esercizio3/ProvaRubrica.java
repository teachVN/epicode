package esercizio3;

public class ProvaRubrica {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();

        rubrica.inserisciContatto("Mario Rossi", "4334343");
        rubrica.inserisciContatto("Maria Rossi", "22234343");
        rubrica.inserisciContatto("Mario Bianchi", "554334343");
        rubrica.inserisciContatto("Flavia Rossi", "6664334343");

        System.out.println(rubrica.cercaContattoPerNome("Mario Rossi"));

        System.out.println(rubrica.cercaContattoPerNumero("8975435"));

        rubrica.rimuoviContatto("Maria Rossi");

        rubrica.stampaContatti();
    }
}
