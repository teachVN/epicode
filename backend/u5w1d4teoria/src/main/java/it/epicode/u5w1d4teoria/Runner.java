package it.epicode.u5w1d4teoria;

import it.epicode.u5w1d4teoria.configuration.AppConfig;
import it.epicode.u5w1d4teoria.entities.Studente;
import it.epicode.u5w1d4teoria.entities.Universita;
import it.epicode.u5w1d4teoria.repository.StudenteRepository;
import it.epicode.u5w1d4teoria.repository.UniversitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private StudenteRepository studenteRepository;
    @Autowired
    private UniversitaRepository universitaRepository;

    @Override
    public void run(String... args) throws Exception {

        AnnotationConfigApplicationContext ctx=
                new AnnotationConfigApplicationContext(U5w1d4teoriaApplication.class);

        Studente s1 = ctx.getBean("Mario", Studente.class);
        studenteRepository.save(s1);

        Studente s2 = ctx.getBean("Francesca", Studente.class);
        studenteRepository.save(s2);

        Studente s3 = ctx.getBean("Roberto", Studente.class);
        studenteRepository.save(s3);

        Universita universita = ctx.getBean(Universita.class);
        universitaRepository.save(universita);

        System.out.println(universita);
    }
}
