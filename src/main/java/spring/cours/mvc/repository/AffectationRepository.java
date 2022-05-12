package spring.cours.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.cours.mvc.model.Affectation;


public interface AffectationRepository extends JpaRepository<Affectation, Integer>{

}
