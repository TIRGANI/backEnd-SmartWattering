package spring.cours.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.cours.mvc.model.Boitier;

public interface BoitierRepository extends JpaRepository<Boitier, Integer>{

}
