package it.epicode.u5w1d4teoria;

import it.epicode.u5w1d4teoria.entities.Studente;
import it.epicode.u5w1d4teoria.repository.StudenteRepository;
import it.epicode.u5w1d4teoria.repository.UniversitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RunnerQuery implements CommandLineRunner {
    @Autowired
    private StudenteRepository studenteRepository;

    @Autowired
    private UniversitaRepository universitaRepository;

    @Override
    public void run(String... args) throws Exception {
        //il metodo findAll estrae tutti gli studenti in tabella e poi col foreach li stampo
        studenteRepository.findAll().forEach(System.out::println);

        System.out.println(studenteRepository.findById(102).get());

        studenteRepository.findByNome("Mario").forEach(System.out::println);

        studenteRepository.findByNomeAndCognome("Francesca", "Rossi")
                .forEach(System.out::println);

        studenteRepository.findByCognomeOrderByNomeAsc("Rossi").forEach(System.out::println);

        studenteRepository.findByUniversitaIsNull().forEach(System.out::println);

        studenteRepository.findByMatricolaBetween(50, 120).forEach(System.out::println);

        System.out.println(studenteRepository.findByMaxMatricola());

        studenteRepository.findStudentsAfterYear(2001).forEach(System.out::println);
    }
}
