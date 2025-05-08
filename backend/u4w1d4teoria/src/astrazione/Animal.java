package astrazione;

/*
le classi astratte vengono create quando ci troviamo in una classe troppo genrica
e non è possibile implementare determinati metodi. Ma se si vuole costringere chi
eredita a implementare determinati comportamenti, allora si può creare una classe astratta.
Se in una classe c'è un metodo astratto, cioè senza corpo, anche la classe dovraà essere astratta.
Le sottoclassi che ereditano la classe astratta dovranno implementare obbligatoriamente
i metodi astratti ereditati. Le classi astratte non sono istanziabili
 */
public abstract  class Animal {

    protected int legs;

    public Animal(int legs){
        this.legs=legs;
    }

    public void walk(){
        System.out.println("the animal walks");
    }

    public abstract void eat(); //metodo astratto
}
