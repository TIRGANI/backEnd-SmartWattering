package spring.cours.mvc.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import spring.cours.mvc.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
