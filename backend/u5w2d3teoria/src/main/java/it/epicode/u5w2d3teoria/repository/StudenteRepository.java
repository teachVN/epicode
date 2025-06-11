package it.epicode.u5w2d3teoria.repository;

import it.epicode.u5w2d3teoria.model.Studente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudenteRepository extends JpaRepository<Studente,Integer>, PagingAndSortingRepository<Studente, Integer> {
}
