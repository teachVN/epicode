package it.epicode.u5w2d2teoria.controller;

import it.epicode.u5w2d2teoria.exception.StudenteNotFoundException;
import it.epicode.u5w2d2teoria.model.Studente;
import it.epicode.u5w2d2teoria.service.StudenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudenteController {

    @Autowired
    private StudenteService studenteService;

    @PostMapping("/studenti")
    public Studente saveStudente(Studente studente){
        return studenteService.saveStudente(studente);
    }

    @GetMapping("/studenti/{matricola}")
    public Studente getStudente(@PathVariable int matricola) throws StudenteNotFoundException {
        return studenteService.getStudente(matricola);
    }

    @GetMapping("/studenti")
    public List<Studente> getAllStudenti(){
        return studenteService.getAllStudenti();
    }
}
