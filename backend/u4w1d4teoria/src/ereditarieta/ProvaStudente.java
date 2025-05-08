package ereditarieta;

public class ProvaStudente {

    public static void main(String[] args) {
        Studente s = new Studente();

        s.setNome("Mario");
        s.setCognome("Rossi");
        s.setEta(19);
        s.setMatricola("121323");

        System.out.println(s);
    }
}
