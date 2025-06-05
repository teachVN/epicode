package it.epicode.u5w1d4teoria;

import it.epicode.u5w1d4teoria.entities.Universita;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx=
                new AnnotationConfigApplicationContext(U5w1d4teoriaApplication.class);

        Universita universita = ctx.getBean(Universita.class);

        System.out.println(universita);
    }
}
