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

import spring.cours.mvc.model.Plantage;
import spring.cours.mvc.repository.PlantageRepository;

@RestController
@RequestMapping("plantage")
public class PlantageController {
	@Autowired
	private PlantageRepository plantageRepository;

	@GetMapping("/all")
	public List<Plantage> findAll() {
		return plantageRepository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Optional<Plantage> findByCode(@PathVariable final int id) {
		return plantageRepository.findById(id);
	}
	@PostMapping(value = "/save")
	public void save(@RequestBody final Plantage plantage) {
		plantageRepository.save(plantage);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) int id) {
		plantageRepository.deleteById(id);
	}

}
