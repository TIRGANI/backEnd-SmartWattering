package spring.cours.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import spring.cours.mvc.model.Plante;

public interface PlanteRepository extends JpaRepository<Plante, Integer>{

}
