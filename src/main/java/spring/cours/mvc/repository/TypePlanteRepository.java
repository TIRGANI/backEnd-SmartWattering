package spring.cours.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import spring.cours.mvc.model.TypePlante;

public interface TypePlanteRepository extends JpaRepository<TypePlante, Integer>{

}
