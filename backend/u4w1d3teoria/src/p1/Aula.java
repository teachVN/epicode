package p1;

public class Aula {

    private String nome;

    private Studente[] studenti;

    public Aula(String nome, Studente[] studenti) {
        this.nome = nome;
        this.studenti = studenti;
    }

    public Aula(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Studente[] getStudenti() {
        return studenti;
    }

    public void setStudenti(Studente[] studenti) {
        this.studenti = studenti;
    }

    public void stampa(){
        System.out.println("Nome: " + nome);

        for (int i = 0; i < studenti.length; i++) {
            studenti[i].stampa();
        }
    }
}
