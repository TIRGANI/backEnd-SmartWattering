package spring.cours.mvc.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import spring.cours.mvc.model.Historique;

public interface HistoriqueRepository extends JpaRepository<Historique, Integer>{

}
