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

import spring.cours.mvc.model.Ferme;
import spring.cours.mvc.repository.FermeRepository;

@RestController
@RequestMapping("ferme")
public class FermeController {
	@Autowired
	private FermeRepository fermeRepository;

	@GetMapping("/all")
	public List<Ferme> findAll() {
		return fermeRepository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Optional<Ferme> findByCode(@PathVariable final int id) {
		return fermeRepository.findById(id);
	}
	@PostMapping(value = "/save")
	public void save(@RequestBody final Ferme ferme) {
		fermeRepository.save(ferme);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) int id) {
		fermeRepository.deleteById(id);
	}
}
