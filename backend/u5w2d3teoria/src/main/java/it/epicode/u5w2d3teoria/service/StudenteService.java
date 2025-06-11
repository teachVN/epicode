package it.epicode.u5w2d3teoria.service;

import it.epicode.u5w2d3teoria.dto.StudenteDto;
import it.epicode.u5w2d3teoria.exception.NotFoundException;
import it.epicode.u5w2d3teoria.model.Studente;
import it.epicode.u5w2d3teoria.model.Universita;
import it.epicode.u5w2d3teoria.repository.StudenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudenteService {

    @Autowired
    private StudenteRepository studenteRepository;

    @Autowired
    private UniversitaService universitaService;

    public Studente saveStudente(StudenteDto studenteDto) throws NotFoundException {
        //studenteDto contiene solo nome, cognome, dataNascita e universitaId
        //cercare l'universita in base all'id
        Universita universita = universitaService.getUniversita(studenteDto.getUniversitaId());

        //creo uno studente dell'Entità Studente e gli setto tutti i dati del dto e dell'universita
        Studente studente = new Studente();
        studente.setNome(studenteDto.getNome());
        studente.setCognome(studenteDto.getCognome());
        studente.setDataNascita(studenteDto.getDataNascita());
        studente.setUniversita(universita);

        return studenteRepository.save(studente);
    }

    public List<Studente> getAllStudenti(){
        return studenteRepository.findAll();
    }

    public Studente getStudente(int matricola) throws NotFoundException {
        return studenteRepository.findById(matricola).
                orElseThrow(() -> new NotFoundException("Studente con matricola " + matricola + " non presente"));
    }

    public Studente updateStudente(int matricola, StudenteDto studenteDto) throws NotFoundException {
        Studente studenteDaAggiornare = getStudente(matricola);

        studenteDaAggiornare.setNome(studenteDto.getNome());
        studenteDaAggiornare.setCognome(studenteDto.getCognome());
        studenteDaAggiornare.setDataNascita(studenteDto.getDataNascita());
        /*
        nel dto io ho anche universitaId, quindi devo verificare se l'id dell'università collegata allo studente
        sul db è diversa dall'id dell'università nel dto. Se sono differenti, vuol dire che lo studente ha
        cambiato università e quindi vado a cercare questa nuova università sul db e se la trovo la setto sullo
        studente da aggiornare
         */
        if(studenteDaAggiornare.getUniversita().getId()!=studenteDto.getUniversitaId()){
            Universita universita = universitaService.getUniversita(studenteDto.getUniversitaId());
            studenteDaAggiornare.setUniversita(universita);
        }

        return studenteRepository.save(studenteDaAggiornare);
    }

    public void deleteStudente(int matricola) throws NotFoundException {
        Studente studenteDaCancellare = getStudente(matricola);

        studenteRepository.delete(studenteDaCancellare);
    }
}
