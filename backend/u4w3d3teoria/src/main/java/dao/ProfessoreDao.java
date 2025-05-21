package dao;

import entities.Professore;
import entities.Studente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ProfessoreDao {
    private EntityManager em;

    public ProfessoreDao(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
        em = emf.createEntityManager();
    }

    //dovrà salvare nel database lo studente che gli viene passato
    public void salva(Professore professore){
        em.getTransaction().begin(); //inizio la transazione

        em.persist(professore);//dico al jpa di salvare lo studente sul database

        em.getTransaction().commit();//il salvataggio effettivo avverrà solo al commit
    }


    public Professore getById(int id){
        return em.find(Professore.class,id);
    }

    public void rimuovi(int id){
        Professore professore = getById(id);

        if(professore!=null){
            em.getTransaction().begin();
            em.remove(professore);
            em.getTransaction().commit();
        }
        else{
            System.out.println("Professore con id " + id+ " non trovato");
        }
    }
}
