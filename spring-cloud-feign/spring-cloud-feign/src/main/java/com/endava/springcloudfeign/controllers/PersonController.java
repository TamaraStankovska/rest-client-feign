package com.endava.springcloudfeign.controllers;

import com.endava.springcloudfeign.model.Person;
import com.endava.springcloudfeign.repository.PersonRepository;
import com.endava.springcloudfeign.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PersonController {

    PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService=personService;
    }
    @GetMapping(value = "/person")
    public Iterable<Person> findAll() {
        return personService.findAll();
    }


    @GetMapping(value = "/person/findById/{id}")
    @ResponseBody
    public Optional<Person> findById(@PathVariable(value = "id") Long id) {
        return personService.findById(id);
    }

    @GetMapping(value = "/person/names/{name}")
    @ResponseBody
    public Optional<Person> findByName(@PathVariable(value = "name") String name)
    {
        return personService.findByName(name);
    }


    @PostMapping(value = "person")
    @ResponseBody
    public void savePerson(@RequestBody Person person){
        personService.save(person);
    }


    @DeleteMapping(value = "/person/delete/{id}")
    public void deletePerson(@PathVariable Long id){
        personService.deleteById(id);
    }






}
