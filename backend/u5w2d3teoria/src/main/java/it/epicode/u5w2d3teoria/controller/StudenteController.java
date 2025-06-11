package it.epicode.u5w2d3teoria.controller;

import it.epicode.u5w2d3teoria.dto.StudenteDto;
import it.epicode.u5w2d3teoria.exception.NotFoundException;
import it.epicode.u5w2d3teoria.model.Studente;
import it.epicode.u5w2d3teoria.service.StudenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
    public Studente saveStudente(@RequestBody StudenteDto studenteDto) throws NotFoundException {
        return studenteService.saveStudente(studenteDto);
    }

    @GetMapping("")
    public Page<Studente> getAllStudenti(@RequestParam(defaultValue = "0") int page,
                                         @RequestParam(defaultValue = "10") int size,
                                         @RequestParam(defaultValue = "matricola") String sortBy){
        return studenteService.getAllStudenti(page, size, sortBy);
    }

    @GetMapping("/{matricola}")
    public Studente getStudente(@PathVariable int matricola) throws NotFoundException {
        return studenteService.getStudente(matricola);
    }

    @PutMapping("/{matricola}")
    public Studente updateStudente(@PathVariable int matricola, @RequestBody StudenteDto studenteDto) throws NotFoundException {
        return studenteService.updateStudente(matricola, studenteDto);
    }

    @DeleteMapping("/{matricola}")
    public void deleteStudente(@PathVariable int matricola) throws NotFoundException {
        studenteService.deleteStudente(matricola);
    }
}
