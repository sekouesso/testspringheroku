package com.esso.testproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.esso.testproject.models.Person;
import com.esso.testproject.repository.PersonRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {
	private final PersonRepo repo;
	
	public List<Person> findAll(){
		return this.repo.findAll();
	}
	
	public Person save(Person person) {
		return this.repo.save(person);
	}
	
	public Person findOne(Long id) {
		return this.repo.findById(id).get();
	}
	
	public Person update(Person person,Long id) {
	Person p = findOne(id);
	person.setId(p.getId());
	this.repo.save(person);
	return person;
	}
	
	public String delete(Long id) {
		Person p = findOne(id);
		this.repo.deleteById(id);
		return "Spression réussi";
	}
	

}
