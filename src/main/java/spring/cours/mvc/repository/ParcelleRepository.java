package spring.cours.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.cours.mvc.model.Parcelle;

public interface ParcelleRepository extends JpaRepository<Parcelle, Integer>{

}
