package ereditarieta;

public class ProvaStudente {

    public static void main(String[] args) {
        Studente s = new Studente("Mario", "Rossi", 25, "3234");

//        s.setNome("Mario");
//        s.setCognome("Rossi");
//        s.setEta(19);
//        s.setMatricola("121323");

        System.out.println(s);

        //utilizzato una variabile reference di tipo superclasse, che posso
        //associare ad un oggetto sottoclasse
        Persona p = new Studente("Dario", "Bianchi", 20, "265");
        //posso accedere solo ai metodi della superclasse. I metodi per la matricola non sono
        //accessibili attraverso la variabile p
        //a runtime il metodo da eseguire verrà scelto in base al tipo dell'oggetto. Se c'è un override nella classe dell'oggetto
        //allora prenderà quello, altrimenti prenderà quello della superclasse
        System.out.println(p);

        //vantaggio di scrivere in questo modo è che se ho un array di oggetti eterogenei ma in ereditarietà
        //posso creare un solo array di tipo superclasse, assegnare ad ogni posizione
        //sia oggetti di tipo superclasse che di tipo sottoclasse
        //se ho bisogno di applicare un metodo di cui ho fatto override su tutti gli elementi
        //dell'array, java a runtime andrà a vedere quale oggetto c'è nella posizione e chiamerà
        //il metodo di quell'oggetto se è presente, altrimenti andrà a prenderlo nella superclasse
        Persona[] persone = new Persona[4];
        persone[0]=new Studente("Dario", "Bianchi", 20, "265");
        persone[1]=new Studente("Maria", "Bianchi", 25, "266");
        persone[2]=new Persona("Barbara", "Bianchi", 26);
        persone[3]=new Persona("Francesco", "Bianchi", 24);

        for (int i = 0; i < persone.length; i++) {
            System.out.println(persone[i]);
        }
            //il cast esplicito non funziona quando la variabile è di tipo sottoclasse
        //e l'oggetto è di tipo superclasse perchè non troverà la matricola nell'oggetto
//        Studente s2 = (Studente)new Persona("Mario", "Coda", 18);
//
//        System.out.println(s2);
        /*
        in questo caso ho assegnato alla variabile di tipo sottoclasse una variabile di tipo superclasse
        che è a sua volta collegata ad un oggetto di tipo sottoclasse.
        Se il tipo del cast è corrispondente al tipo dell'oggetto collegato a p, allora
        il cast va a buon fine perchè l'oggetto ha la matricola a cui la variabile di tipo
        Studente vuole accedere
         */
        Studente s3 = (Studente)p;

        System.out.println(s3);
    }
}
