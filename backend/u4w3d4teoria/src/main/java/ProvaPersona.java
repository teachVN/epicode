import dao.PersonaDao;
import entities.Professore;
import entities.Studente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class ProvaPersona {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres");
        EntityManager em = emf.createEntityManager();

        PersonaDao personaDao = new PersonaDao(em);

        Studente s1 = new Studente("Francesco", "Rossi", LocalDate.of(2000,7,7),
                23424, "Liceo Scientifico De Santis");

        Professore p1 = new Professore("Bianca", "Bianchi", LocalDate.of(1990, 4,4),
                "Informatica");

        //personaDao.save(s1);
        //personaDao.save(p1);

        System.out.println(personaDao.getPersoneByName("Francesco"));
    }
}
