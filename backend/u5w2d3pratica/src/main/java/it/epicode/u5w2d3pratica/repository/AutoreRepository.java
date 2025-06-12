package it.epicode.u5w2d3pratica.repository;

import it.epicode.u5w2d3pratica.model.Autore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AutoreRepository extends JpaRepository<Autore, Integer>, PagingAndSortingRepository<Autore, Integer> {
}
