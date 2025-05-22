package dao;

import entities.Persona;
import jakarta.persistence.EntityManager;

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
}
