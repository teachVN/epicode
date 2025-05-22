package dao;

import entities.Evento;
import entities.Partecipazione;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class PartecipazioneDao {

    private EntityManager em;

    public PartecipazioneDao(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
        em = emf.createEntityManager();
    }

    public void save(Partecipazione partecipazione){
        em.getTransaction().begin();
        em.persist(partecipazione);
        em.getTransaction().commit();
    }

    public Partecipazione getById(int id){
        return em.find(Partecipazione.class, id);
    }

    public void remove(int id){
        Partecipazione partecipazione = getById(id);

        if(partecipazione!=null){
            em.getTransaction().begin();
            em.remove(partecipazione);
            em.getTransaction().commit();
        }
        else{
            System.out.println("entities.Partecipazione con id " + id + " non trovato");
        }
    }

    public void close(){
        em.close();

    }

    /*
    in questo metodo devo estrarre tutte le partecipazioni da confermare per cui nella where condition ho messo
    p.stato=Stato.NON_CONFERMATO e poi l'evento deve esssere quello passato come parametro e quindi ho posto
    p.evento=all'evento passato in ingresso
     */
    public List<Partecipazione> getPartecipazioniDaConfermarePerEvento(Evento e){
        TypedQuery<Partecipazione> query = em.createQuery("select p from Partecipazione p where p.stato=Stato.NON_CONFERMATA and p.evento=:evento", Partecipazione.class);
        query.setParameter("evento",e);
        return query.getResultList();

    }
}
