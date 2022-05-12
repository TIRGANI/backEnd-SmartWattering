package spring.cours.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.cours.mvc.model.Grandeur;

public interface GrandeurRepository extends JpaRepository<Grandeur, Integer>{

}
