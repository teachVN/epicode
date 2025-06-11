package it.epicode.u5w2d3teoria.repository;

import it.epicode.u5w2d3teoria.model.Universita;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversitaRepository extends JpaRepository<Universita,Integer> {
}
