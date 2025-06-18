package chainOfResponsability;

public abstract class Erogatore {

    private int valoreBanconota;
    private Erogatore erogatoreSuccessivo;

    public Erogatore(int valoreBanconota) {
        this.valoreBanconota = valoreBanconota;
    }

    public int getValoreBanconota() {
        return valoreBanconota;
    }

    public void setValoreBanconota(int valoreBanconota) {
        this.valoreBanconota = valoreBanconota;
    }

    public Erogatore getErogatoreSuccessivo() {
        return erogatoreSuccessivo;
    }

    public void setErogatoreSuccessivo(Erogatore erogatoreSuccessivo) {
        this.erogatoreSuccessivo = erogatoreSuccessivo;
    }

    public void eroga(ContoBancario contoBancario){
        int saldo = contoBancario.getSaldo();
        int prelievoRimanente = contoBancario.getPrelievoRestante();

        if(saldo>=prelievoRimanente){
            if(prelievoRimanente>=valoreBanconota){
                int numBanconote = prelievoRimanente/valoreBanconota;
                //prelievoRimanente%valoreBanconota fornirà il prelievo che rimane dopo questa erogazione
                contoBancario.setPrelievoRestante(prelievoRimanente%valoreBanconota);
                contoBancario.setSaldo(saldo-(numBanconote*valoreBanconota));

                System.out.println("Erogate " + numBanconote + " banconote da " + valoreBanconota + "€");
            }
            else{
                System.out.println("Erogate 0 banconote da " + valoreBanconota + "€");
            }

            if(erogatoreSuccessivo!=null){
                erogatoreSuccessivo.eroga(contoBancario);
            }
        }
        else{
            System.out.println("Prelievo non possibile per saldo insufficiente");
        }

    }
}
