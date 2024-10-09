package HackatonAPI.repository;

import HackatonAPI.domain.entities.Activitat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivitatRepository extends JpaRepository<Activitat, Long> {
}
