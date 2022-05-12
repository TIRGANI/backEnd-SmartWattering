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

import spring.cours.mvc.model.Historique;
import spring.cours.mvc.repository.HistoriqueRepository;

@RestController
@RequestMapping("historique")
public class HistoriqueController {
	@Autowired
	private HistoriqueRepository historiqueRepository;

	@GetMapping("/all")
	public List<Historique> findAll() {
		return historiqueRepository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Optional<Historique> findByCode(@PathVariable final int id) {
		return historiqueRepository.findById(id);
	}
	@PostMapping(value = "/save")
	public void save(@RequestBody final Historique historique) {
		historiqueRepository.save(historique);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) int id) {
		historiqueRepository.deleteById(id);
	}
}
