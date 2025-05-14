package stream;

import java.time.LocalDate;
import java.util.List;

public class ProvaStream2 {

    public static void main(String[] args) {
        Persona p1 = new Persona("Mario", "Rossi", 20, LocalDate.of(2000, 5,5));
        Persona p2 = new Persona("Maria", "Rossi", 23, LocalDate.of(2005, 6,15));
        Persona p3 = new Persona("Sara", "Bianchi", 24, LocalDate.of(2002, 7,25));
        Persona p4 = new Persona("Giorgio", "Verdi", 20, LocalDate.of(2001, 5,5));

        List<Persona> persone = List.of(p1,p2,p3,p4);

        persone.stream().filter(persona -> persona.getNome().startsWith("M")).forEach(System.out::println);

        persone.stream().sorted((o1, o2) -> o1.getEta().compareTo(o2.getEta())).forEach(System.out::println);

        System.out.println("---------------");

        persone.stream().map(persona -> persona.getNome()).forEach(System.out::println);

    }
}
