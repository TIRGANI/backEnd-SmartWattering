package spring.cours.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.cours.mvc.model.Alert;


public interface AlertRepository extends JpaRepository<Alert, Integer>{

}
