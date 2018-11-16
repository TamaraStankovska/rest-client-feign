package com.endava.feignclient.controller;


import com.endava.feignclient.client.PersonClient;
import com.endava.feignclient.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonClient personClient;

    @GetMapping(value = "/person")
    public List<Person> findAll(){
       return personClient.findAll();
    }

}
