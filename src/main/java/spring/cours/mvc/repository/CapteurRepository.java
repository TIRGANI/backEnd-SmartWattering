package spring.cours.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.cours.mvc.model.Capteur;


public interface CapteurRepository extends JpaRepository<Capteur, Integer>{

}
