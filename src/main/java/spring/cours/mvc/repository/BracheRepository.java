package spring.cours.mvc.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import spring.cours.mvc.model.Branche;

public interface BracheRepository extends JpaRepository<Branche, Integer>{

}
