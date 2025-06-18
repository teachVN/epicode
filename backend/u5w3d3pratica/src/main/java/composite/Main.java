package composite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pagina p1 = new Pagina();
        Pagina p2 = new Pagina();
        Pagina p3 = new Pagina();
        Pagina p4 = new Pagina();
        Pagina p5 = new Pagina();
        Pagina p6 = new Pagina();
        Pagina p7 = new Pagina();
        Pagina p8 = new Pagina();
        Pagina p9 = new Pagina();
        Pagina p10 = new Pagina();

        SottoSezione sottoSezione1 = new SottoSezione(List.of(p1,p2,p3));
        SottoSezione sottoSezione2 = new SottoSezione(List.of(p4,p5,p6));

        Sezione s1 = new Sezione(List.of(sottoSezione1, p7,p8));
        Sezione s2 = new Sezione(List.of(sottoSezione2, p9,p10));

        Libro l = new Libro(10, List.of("Manzoni"), List.of(s1, s2), "Promessi Sposi");

        System.out.println(l.getPagine());



    }
}
