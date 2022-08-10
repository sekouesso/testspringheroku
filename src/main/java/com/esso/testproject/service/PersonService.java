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
	

}
