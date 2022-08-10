package com.esso.testproject.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.esso.testproject.models.Person;
import com.esso.testproject.service.PersonService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PersonController {
	
	private final PersonService service;
	
	@GetMapping("/persons")
	public List<Person> findAll() {
		return service.findAll();
	}
	
	@PostMapping("/persons")
	public Person save(@RequestBody Person person) {
		return service.save(person);
	}
	
	@GetMapping("/persons/{id}")
	public Person findOne(@PathVariable Long id) {
		return service.findOne(id);
	}
	
	@PatchMapping("/persons/{id}")
	public Person update(@RequestBody Person person, @PathVariable Long id) {
		return service.update(person, id);
	}
	
	@DeleteMapping("/persons/{id}")
	public String delete(@PathVariable Long id) {
		return service.delete(id);
	}
	

}
