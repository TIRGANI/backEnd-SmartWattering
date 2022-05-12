package spring.cours.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import spring.cours.mvc.model.Ferme;

public interface FermeRepository extends JpaRepository<Ferme, Integer>{

}
