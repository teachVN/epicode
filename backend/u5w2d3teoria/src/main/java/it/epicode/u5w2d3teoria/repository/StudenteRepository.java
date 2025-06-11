package it.epicode.u5w2d3teoria.repository;

import it.epicode.u5w2d3teoria.model.Studente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudenteRepository extends JpaRepository<Studente,Integer> {
}
