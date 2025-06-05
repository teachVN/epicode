package it.epicode.u5w1d4teoria.repository;

import it.epicode.u5w1d4teoria.entities.Studente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//il repository deve essere una interfaccia, deve estendere JpaRepository
//i tipi tra parentesi angolari sono il nome della entità e il tipo della chiave primaria
public interface StudenteRepository extends JpaRepository<Studente,Integer> {
    //Derived query: la sintassi è rigida e richiede che il nome del metodo contenga findBy
    //seguito dal nome della o delle proprietà scritte sempre con la prima lettera maiuscola
    //il valore della proprietà per cui cercare deve essere passato come parametro di ingresso
    List<Studente> findByNome(String nome);
    List<Studente> findByNomeAndCognome(String nome, String cognome);
}
