package it.epicode.u5w2d3pratica.service;


import it.epicode.u5w2d3pratica.dto.AutoreDto;
import it.epicode.u5w2d3pratica.exception.NonTrovatoException;
import it.epicode.u5w2d3pratica.model.Autore;
import it.epicode.u5w2d3pratica.repository.AutoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class AutoreService {

    @Autowired
    private AutoreRepository autoreRepository;

    public Autore saveAutore(AutoreDto autoreDto){

        Autore autore = new Autore();
        autore.setNome(autoreDto.getNome());
        autore.setCognome(autoreDto.getCognome());
        autore.setEmail(autoreDto.getEmail());
        autore.setDataDiNascita(autoreDto.getDataDiNascita());
        autore.setAvatar("https://ui-avatars.com/api/?name="+autore.getNome()+"+"+autore.getCognome());

        return autoreRepository.save(autore);

    }

    public Page<Autore> getAutori(int page, int size, String sortBy){
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return autoreRepository.findAll(pageable);
    }

    public Autore getAutore(int id) throws NonTrovatoException {
        return autoreRepository.findById(id).
                orElseThrow(() -> new NonTrovatoException("Autore con id:" + id + " non trovato"));
    }

    public Autore updateAutore(int id, AutoreDto autoreDto) throws NonTrovatoException {
        Autore autoreDaAggiornare = getAutore(id);

        autoreDaAggiornare.setNome(autoreDto.getNome());
        autoreDaAggiornare.setCognome(autoreDto.getCognome());
        autoreDaAggiornare.setEmail(autoreDto.getEmail());
        autoreDaAggiornare.setDataDiNascita(autoreDto.getDataDiNascita());
        autoreDaAggiornare.setAvatar("https://ui-avatars.com/api/?name="+autoreDto.getNome()+"+"+autoreDto.getCognome());

        return autoreRepository.save(autoreDaAggiornare);
    }


    public void deleteAutore(int id) throws NonTrovatoException {
        Autore autoreDaRimuovere = getAutore(id);

        autoreRepository.delete(autoreDaRimuovere);
    }
}
