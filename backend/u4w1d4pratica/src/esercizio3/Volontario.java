package esercizio3;

import java.time.LocalDateTime;

public class Volontario implements Lavoratore{

    private String nome;
    private int eta;
    private String cv;

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Volontario{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", cv='" + cv + '\'' +
                '}';
    }

    @Override
    public void checkIn(LocalDateTime timbratura) {
        System.out.println("Inizio servizio " + timbratura);
    }
}
