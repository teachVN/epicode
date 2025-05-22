package dao;

import entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class PersonaDao {

    private EntityManager em;

    public PersonaDao(EntityManager em) {
        this.em = em;
    }

    public void save(Persona p){
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    public Persona getById(int id){
        return em.find(Persona.class, id);
    }

    public void remove(int id){
        Persona p= getById(id);

        if(p!=null){
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        }
        else{
            System.out.println("la persona " + p + " non esiste");
        }
    }
    //estrarre tutte le persone che hanno un nome passato come parametro di ingresso
    public List<Persona> getPersoneByName(String name){
        /*
        per estrarre le persone che hanno un determinato nome, eseguo una dynamic query scritta in jpql
        Utilizzo il metodo createQuery dell'Em a cui passo un query scritta in jpql che ha un parametro
        al suo interno. I parametri si scrivono :nomeparametro. Questo rende la query dinamica perchè
        posso sostituirci qualsiasi valore. Il secondo parametro del metodo createQuery prende il tipo
        dell'oggetto che restituirà la query. createQuery restituisce una TypedQuery cioè un oggetto
        tipizzato. Sulla variabile query applico il metodo setParameter per sostituire il parametro con
        la variabile di ingresso del metodo
         */
        TypedQuery<Persona> query= em.createQuery("select p from Persona p where p.nome=:nome", Persona.class);
        query.setParameter("nome", name);
        //query.getResultList per eseguire ed estrarre dal risultato la lista delle persone
        return query.getResultList();
    }
}
