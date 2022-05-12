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
import spring.cours.mvc.model.Parcelle;
import spring.cours.mvc.repository.FermeRepository;
import spring.cours.mvc.repository.ParcelleRepository;

@RestController
@RequestMapping("parcelle")
public class ParcelleController {
	@Autowired
	private ParcelleRepository parcelleRepository;

	@GetMapping("/all")
	public List<Parcelle> findAll() {
		return parcelleRepository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Optional<Parcelle> findByCode(@PathVariable final int id) {
		return parcelleRepository.findById(id);
	}
	@PostMapping(value = "/save")
	public void save(@RequestBody final Parcelle parcelle) {
		parcelleRepository.save(parcelle);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) int id) {
		parcelleRepository.deleteById(id);
	}
}
