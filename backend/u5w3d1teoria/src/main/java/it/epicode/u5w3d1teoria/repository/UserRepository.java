package it.epicode.u5w3d1teoria.repository;

import it.epicode.u5w3d1teoria.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
