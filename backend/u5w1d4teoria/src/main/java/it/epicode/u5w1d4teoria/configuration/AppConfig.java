package it.epicode.u5w1d4teoria.configuration;

import it.epicode.u5w1d4teoria.entities.Studente;
import it.epicode.u5w1d4teoria.entities.Universita;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("Mario")
    public Studente getStudente1(){
        Studente s1 = new Studente();
        s1.setNome("Mario");
        s1.setCognome("Rossi");
        s1.setDataNascita(LocalDate.of(2000,2,2));
        return s1;
    }

    @Bean("Francesca")
    public Studente getStudente2(){
        Studente s1 = new Studente();
        s1.setNome("Francesca");
        s1.setCognome("Rossi");
        s1.setDataNascita(LocalDate.of(2001,2,2));
        return s1;
    }

    @Bean("Roberto")
    public Studente getStudente3(){
        Studente s1 = new Studente();
        s1.setNome("Roberto");
        s1.setCognome("Bianchi");
        s1.setDataNascita(LocalDate.of(2002,2,2));
        return s1;
    }
    @Bean
    public Universita getUniversita(){
        Universita universita = new Universita();
        universita.setStudenti(List.of(getStudente1(), getStudente2(), getStudente3()));
        return universita;
    }


}
