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

import spring.cours.mvc.model.Plante;
import spring.cours.mvc.repository.PlanteRepository;

@RestController
@RequestMapping("plant")
public class PlantController {
	@Autowired
	private PlanteRepository planteRepository;

	@GetMapping("/all")
	public List<Plante> findAll() {
		return planteRepository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Optional<Plante> findByCode(@PathVariable final int id) {
		return planteRepository.findById(id);
	}
	@PostMapping(value = "/save")
	public void save(@RequestBody final Plante plante) {
		planteRepository.save(plante);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) int id) {
		planteRepository.deleteById(id);
	}
}
