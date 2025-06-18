package chainOfResponsability;

public class ContoBancario {

    private int numConto;
    private int saldo;
    private int prelievo;
    private int prelievoRestante;

    public ContoBancario(int numConto, int saldo, int prelievo, int prelievoRestante) {
        this.numConto = numConto;
        this.saldo = saldo;
        this.prelievo = prelievo;
        this.prelievoRestante = prelievoRestante;
    }

    public int getNumConto() {
        return numConto;
    }

    public void setNumConto(int numConto) {
        this.numConto = numConto;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getPrelievo() {
        return prelievo;
    }

    public void setPrelievo(int prelievo) {
        this.prelievo = prelievo;
    }

    public int getPrelievoRestante() {
        return prelievoRestante;
    }

    public void setPrelievoRestante(int prelievoRestante) {
        this.prelievoRestante = prelievoRestante;
    }
}
