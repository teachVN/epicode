package it.epicode.u5w2d3teoria.service;

import it.epicode.u5w2d3teoria.exception.NotFoundException;
import it.epicode.u5w2d3teoria.model.Universita;
import it.epicode.u5w2d3teoria.repository.UniversitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversitaService {
    @Autowired
    private UniversitaRepository universitaRepository;

    public Universita saveUniversita(Universita universita){
       return universitaRepository.save(universita);
    }

    public List<Universita> getAllUniversita(){
        return universitaRepository.findAll();
    }

    public Universita getUniversita(int id) throws NotFoundException {
        return universitaRepository.findById(id).
                orElseThrow(() -> new NotFoundException("Universita con id " + id + " non trovata"));
    }

    public Universita updateUniversita(int id, Universita universita) throws NotFoundException {
        Universita universitaDaAggiornare = getUniversita(id);

        universitaDaAggiornare.setNome(universita.getNome());
        universitaDaAggiornare.setCitta(universita.getCitta());

        return universitaRepository.save(universitaDaAggiornare);
    }

    public void deleteUniversita(int id) throws NotFoundException {
        Universita universitaDaCancellare = getUniversita(id);

        universitaRepository.delete(universitaDaCancellare);
    }
}
