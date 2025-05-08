package ereditarieta;

public class ProvaLibri {
    public static void main(String[] args) {
        Libri l1 = new Libri("Il nome della rosa", 1980, 10);
        LibriCat l2 = new LibriCat("Avengers", 2000, 10, "Fantasy");

        System.out.println(l1.stessoCosto(l2));

        System.out.println(l2.stessaCategoria(l1));

        LibriCat l3 = new LibriCat("Harry Potter", 2000, 10, "Horror");

        System.out.println(l2.stessaCategoria(l3));
    }
}
