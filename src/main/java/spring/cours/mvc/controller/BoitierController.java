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

import spring.cours.mvc.model.*;
import spring.cours.mvc.repository.BoitierRepository;

@RestController
@RequestMapping("boitier")
public class BoitierController {
	@Autowired
	private BoitierRepository boitierRepository;

	@GetMapping("/all")
	public List<Boitier> findAll() {
		return boitierRepository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Optional<Boitier> findByCode(@PathVariable final int id) {
		return boitierRepository.findById(id);
	}
	@PostMapping(value = "/save")
	public void save(@RequestBody final Boitier boitier) {
		boitierRepository.save(boitier);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable(required = true) int id) {
		boitierRepository.deleteById(id);
	}
}
