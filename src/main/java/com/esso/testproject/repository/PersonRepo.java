package com.esso.testproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esso.testproject.models.Person;

public interface PersonRepo extends JpaRepository<Person, Long>{

}
