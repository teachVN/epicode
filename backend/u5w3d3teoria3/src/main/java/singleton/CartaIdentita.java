package singleton;

import java.time.LocalDate;
/*
- la classe deve avere una variabile statica della stessa classe
- la classe deve avere un costruttore e deve essere private per non permettere a nessuno di chiamare il costruttore
- deve avere un metodo statico che restituisce un oggetto di questa classe. Il metodo deve verificare se esiste già
un oggetto di questa classe. Se non esiste, deve crearlo e restituirlo. Se esiste, deve restituirlo
Il metodo deve essere per forza statico per poter essere richiamato dall'esterno, visto che non possiamo creare oggetti
 */
public class CartaIdentita {

    private String nome;
    private String citta;
    private LocalDate dataNascita;
    private static CartaIdentita cartaIdentita;

    private CartaIdentita(String nome, String citta, LocalDate dataNascita) {
        this.nome = nome;
        this.citta = citta;
        this.dataNascita = dataNascita;
    }

    public static CartaIdentita getCartaIdentita(){
        if(cartaIdentita==null){
            cartaIdentita=new CartaIdentita("Mario Rossi", "Roma", LocalDate.of(2000,9,9));
        }

        return cartaIdentita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }
}
