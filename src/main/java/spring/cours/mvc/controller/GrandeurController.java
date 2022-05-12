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

import spring.cours.mvc.model.Grandeur;
import spring.cours.mvc.repository.GrandeurRepository;

@RestController
@RequestMapping("grandeur")
public class GrandeurController {
	@Autowired
	private GrandeurRepository grandeurRepository;

	@GetMapping("/all")
	public List<Grandeur> findAll() {
		return grandeurRepository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Optional<Grandeur> findByCode(@PathVariable final int id) {
		return grandeurRepository.findById(id);
	}
	@PostMapping(value = "/save")
	public void save(@RequestBody final Grandeur grandeur) {
		grandeurRepository.save(grandeur);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) int id) {
		grandeurRepository.deleteById(id);
	}
}
