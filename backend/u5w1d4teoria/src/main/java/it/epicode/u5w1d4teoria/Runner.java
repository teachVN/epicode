package it.epicode.u5w1d4teoria;

import it.epicode.u5w1d4teoria.configuration.AppConfig;
import it.epicode.u5w1d4teoria.entities.Studente;
import it.epicode.u5w1d4teoria.entities.Universita;
import it.epicode.u5w1d4teoria.repository.StudenteRepository;
import it.epicode.u5w1d4teoria.repository.UniversitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class Runner implements CommandLineRunner {
    /*
    ogni volta che vogliamo usare i repository dobbiamo iniettarli nella classe che li
    deve usare, iniettarli con l'autowired
     */

    @Autowired
    private StudenteRepository studenteRepository;

    @Autowired
    private UniversitaRepository universitaRepository;

    @Autowired
    @Qualifier("Mario")
    private Studente s1;

    @Autowired
    @Qualifier("Francesca")
    private Studente s2;

    @Autowired
    @Qualifier("Roberto")
    private Studente s3;

    @Autowired
    private Universita universita;

    @Override
    public void run(String... args) throws Exception {

//        AnnotationConfigApplicationContext ctx=
//                new AnnotationConfigApplicationContext(AppConfig.class);

        //Studente s1 = ctx.getBean("Mario", Studente.class);
        studenteRepository.save(s1);

        //Studente s2 = ctx.getBean("Francesca", Studente.class);
        studenteRepository.save(s2);

        //Studente s3 = ctx.getBean("Roberto", Studente.class);
        studenteRepository.save(s3);

        //Universita universita = ctx.getBean(Universita.class);
        universitaRepository.save(universita);

        System.out.println(universita);

        s1.setUniversita(universita);
        s2.setUniversita(universita);
        s3.setUniversita(universita);

        studenteRepository.save(s1);
        studenteRepository.save(s2);
        studenteRepository.save(s3);

        System.out.println(s1);
    }
}
