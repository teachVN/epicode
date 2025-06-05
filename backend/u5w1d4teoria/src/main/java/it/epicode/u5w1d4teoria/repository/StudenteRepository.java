package it.epicode.u5w1d4teoria.repository;

import it.epicode.u5w1d4teoria.entities.Studente;
import org.springframework.data.jpa.repository.JpaRepository;
//il repository deve essere una interfaccia, deve estendere JpaRepository
//i tipi tra parentesi angolari sono il nome della entità e il tipo della chiave primaria
public interface StudenteRepository extends JpaRepository<Studente,Integer> {
}
