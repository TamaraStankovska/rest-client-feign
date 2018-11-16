package com.endava.springcloudfeign.service;


import com.endava.springcloudfeign.model.Person;
import com.endava.springcloudfeign.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService{

    PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository){
        this.personRepository=personRepository;
    }

    @Override
    public List<Person> findAll() {
        return (List<Person>) personRepository.findAll();
    }

    @Override
    public Optional<Person> findById(Long id) {
        return personRepository.findById(id);
    }

    @Override
    public void save(Person person) {
        personRepository.save(person);

    }

    @Override
    public void deleteById(Long id) {
        personRepository.deleteById(id);

    }

    @Override
    public Optional<Person> findByName(String name) {
        return personRepository.findByName(name);
    }
}
