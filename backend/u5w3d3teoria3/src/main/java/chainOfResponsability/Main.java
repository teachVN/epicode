package chainOfResponsability;

public class Main {
    public static void main(String[] args) {
        ContoBancario contoBancario = new ContoBancario(1, 3000, 752, 752);

        Erogatore erogatore100 = new Erogatore(100);
        Erogatore erogatore50 = new Erogatore(50);
        Erogatore erogatore20 = new Erogatore(20);
        Erogatore erogatore10 = new Erogatore(10);
        Erogatore erogatore5 = new Erogatore(5);
        Erogatore erogatore1 = new Erogatore(1);

        //costruisco la catena di responsabilità
        erogatore100.setErogatoreSuccessivo(erogatore50);
        erogatore50.setErogatoreSuccessivo(erogatore20);
        erogatore20.setErogatoreSuccessivo(erogatore10);
        erogatore10.setErogatoreSuccessivo(erogatore5);
        erogatore5.setErogatoreSuccessivo(erogatore1);

        erogatore100.eroga(contoBancario);

        System.out.println(contoBancario.getSaldo());
        System.out.println(contoBancario.getPrelievoRestante());

     }
}
