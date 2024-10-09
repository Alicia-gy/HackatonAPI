package HackatonAPI.repository;

import HackatonAPI.domain.entities.Usuari;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariRepository extends JpaRepository<Usuari, Long> {
}
