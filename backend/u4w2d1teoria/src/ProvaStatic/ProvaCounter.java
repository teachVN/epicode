package ProvaStatic;

public class ProvaCounter {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        System.out.println(Counter.getContatore());

        System.out.println("---------------");

        Counter c2 = new Counter();
        System.out.println(Counter.getContatore());
        System.out.println(Counter.getContatore());

        System.out.println("---------------");

        Counter c3 = new Counter();
        System.out.println(Counter.getContatore());
        System.out.println(Counter.getContatore());
        System.out.println(Counter.getContatore());

        System.out.println(Counter.getContatore());
    }
}
