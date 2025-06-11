package it.epicode.u5w2d3teoria.controller;

import it.epicode.u5w2d3teoria.exception.NotFoundException;
import it.epicode.u5w2d3teoria.model.Universita;
import it.epicode.u5w2d3teoria.service.UniversitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/universita")
public class UniversitaController {

    @Autowired
    private UniversitaService universitaService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Universita saveUniversita(@RequestBody Universita universita){
        return universitaService.saveUniversita(universita);
    }

    @GetMapping("")
    public List<Universita> getAllUniversita(){
        return universitaService.getAllUniversita();
    }

    @GetMapping("/{id}")
    public Universita getUniversita(@PathVariable int id) throws NotFoundException {
        return universitaService.getUniversita(id);
    }

    @PutMapping("/{id}")
    public Universita updateUniversita(@PathVariable int id,@RequestBody Universita universita) throws NotFoundException {
        return universitaService.updateUniversita(id, universita);
    }

    @DeleteMapping("/{id}")
    public void deleteUniversita(@PathVariable int id) throws NotFoundException {
        universitaService.deleteUniversita(id);
    }
}
