package it.epicode.u5w1d4teoria.repository;

import it.epicode.u5w1d4teoria.entities.Studente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudenteRepository extends JpaRepository<Studente,Integer> {
}
