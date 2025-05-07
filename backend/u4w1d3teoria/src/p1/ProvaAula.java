package p1;

public class ProvaAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("1");

        Studente[] studenti = new Studente[5];

        Studente s1 = new Studente(1, 20, "Mario", "Rossi", Genere.UOMO);
        Studente s2 = new Studente(2, 20, "Maria", "Rossi", Genere.DONNA);
        Studente s3 = new Studente(3, 20, "Dario", "Bianchi", Genere.UOMO);
        Studente s4 = new Studente(4, 20, "Flavia", "Verdi", Genere.DONNA);
        Studente s5 = new Studente(5, 20, "Roberto", "Rossi", Genere.UOMO);

        studenti[0]=s1;
        studenti[1]=s2;
        studenti[2]=s3;
        studenti[3]=s4;
        studenti[4]=s5;

        a1.setStudenti(studenti);

        stampaAula(a1);
    }

    public static void stampaAula(Aula aula){
        System.out.println("Nome: " + aula.getNome());

        for (int i = 0; i < aula.getStudenti().length; i++) {
            aula.getStudenti()[i].stampa();
        }
    }
}
