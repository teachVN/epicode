package it.epicode.u5w2d3teoria.controller;

import it.epicode.u5w2d3teoria.exception.NotFoundException;
import it.epicode.u5w2d3teoria.model.Studente;
import it.epicode.u5w2d3teoria.service.StudenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/studenti")
public class StudenteController {

    @Autowired
    private StudenteService studenteService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Studente saveStudente(@RequestBody Studente studente){
        return studenteService.saveStudente(studente);
    }

    @GetMapping("")
    public List<Studente> getAllStudenti(){
        return studenteService.getAllStudenti();
    }

    @GetMapping("/{matricola}")
    public Studente getStudente(@PathVariable int matricola) throws NotFoundException {
        return studenteService.getStudente(matricola);
    }

    @PutMapping("/{matricola}")
    public Studente updateStudente(@PathVariable int matricola, @RequestBody Studente studente) throws NotFoundException {
        return studenteService.updateStudente(matricola, studente);
    }

    @DeleteMapping("/{matricola}")
    public void deleteStudente(@PathVariable int matricola) throws NotFoundException {
        studenteService.deleteStudente(matricola);
    }
}
