package eci.data.edu.labadapostgres.repository;

import eci.data.edu.labadapostgres.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
