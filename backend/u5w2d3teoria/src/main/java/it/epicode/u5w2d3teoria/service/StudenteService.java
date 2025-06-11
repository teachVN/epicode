package it.epicode.u5w2d3teoria.service;

import it.epicode.u5w2d3teoria.exception.NotFoundException;
import it.epicode.u5w2d3teoria.model.Studente;
import it.epicode.u5w2d3teoria.repository.StudenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudenteService {

    @Autowired
    private StudenteRepository studenteRepository;

    public Studente saveStudente(Studente studente){
        return studenteRepository.save(studente);
    }

    public List<Studente> getAllStudenti(){
        return studenteRepository.findAll();
    }

    public Studente getStudente(int matricola) throws NotFoundException {
        return studenteRepository.findById(matricola).
                orElseThrow(() -> new NotFoundException("Studente con matricola " + matricola + " non presente"));
    }

    public Studente updateStudente(int matricola, Studente studente) throws NotFoundException {
        Studente studenteDaAggiornare = getStudente(matricola);

        studenteDaAggiornare.setNome(studente.getNome());
        studenteDaAggiornare.setCognome(studente.getCognome());
        studenteDaAggiornare.setDataNascita(studente.getDataNascita());

        return studenteRepository.save(studenteDaAggiornare);
    }

    public void deleteStudente(int matricola) throws NotFoundException {
        Studente studenteDaCancellare = getStudente(matricola);

        studenteRepository.delete(studenteDaCancellare);
    }
}
