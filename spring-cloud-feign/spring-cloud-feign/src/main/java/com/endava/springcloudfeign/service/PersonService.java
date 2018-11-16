package com.endava.springcloudfeign.service;

import com.endava.springcloudfeign.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> findAll();
    Optional<Person> findById(Long id);
    void save(Person person);
    void deleteById(Long id);

    Optional<Person> findByName(String name);
}
