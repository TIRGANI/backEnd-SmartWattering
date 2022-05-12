package spring.cours.mvc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.cours.mvc.model.User;
import spring.cours.mvc.repository.UserRepository;

@RestController
@RequestMapping("users")

public class UserController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/all")
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Optional<User> findByCode(@PathVariable final int id) {
		return userRepository.findById(id);
	}
	@PostMapping(value = "/save")
	public void save(@RequestBody final User user) {
		userRepository.save(user);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) int id) {
		userRepository.deleteById(id);
	}
}
