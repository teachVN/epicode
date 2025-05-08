package astrazione;

public class ProvaAnimal {

    public static void main(String[] args) {
        Spider spider = new Spider(8);

        spider.walk();
        spider.eat();

        Animal a = new Fish("Nemo");

        a.walk();
        a.eat();

        Pet p = new Fish("Nemo");

        p.play();
    }
}
