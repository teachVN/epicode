package entities;

import enumeration.TipoEvento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "partite_di_calcio")
@NamedQuery(name = "getPartiteVinteInCasa", query = "select p from PartitaDiCalcio p where p.goalCasa>p.goalTrasferta")
@NamedQuery(name = "getPartiteVinteInTrasferta", query = "select p from PartitaDiCalcio p where p.goalCasa<p.goalTrasferta")
@NamedQuery(name = "getPartitePareggiate", query = "select p from PartitaDiCalcio p where p.goalCasa=p.goalTrasferta")
public class PartitaDiCalcio extends Evento{
@Column(name = "squadra_casa")
    private String squadraCasa;
    @Column(name = "squadra_ospite")
    private String squadraOspite;
    @Column(name = "squadra_vincente")
    private String squadraVincente;
    @Column(name = "goal_casa")
    private int goalCasa;
    @Column(name = "goal_trasferta")
    private int goalTrasferta;

    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMaxPartecipanti, String squadraCasa, String squadraOspite, String squadraVincente, int goalCasa, int goalTrasferta) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMaxPartecipanti);
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.goalCasa = goalCasa;
        this.goalTrasferta = goalTrasferta;
    }

    public PartitaDiCalcio(){
    }

    public String getSquadraCasa() {
        return squadraCasa;
    }

    public void setSquadraCasa(String squadraCasa) {
        this.squadraCasa = squadraCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getGoalCasa() {
        return goalCasa;
    }

    public void setGoalCasa(int goalCasa) {
        this.goalCasa = goalCasa;
    }

    public int getGoalTrasferta() {
        return goalTrasferta;
    }

    public void setGoalTrasferta(int goalTrasferta) {
        this.goalTrasferta = goalTrasferta;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraCasa='" + squadraCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", goalCasa=" + goalCasa +
                ", goalTrasferta=" + goalTrasferta +
                "} " + super.toString();
    }
}
