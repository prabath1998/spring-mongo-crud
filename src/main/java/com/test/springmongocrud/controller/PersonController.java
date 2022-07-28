package com.test.springmongocrud.controller;

import com.test.springmongocrud.collection.Person;
import com.test.springmongocrud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    public String save(@RequestBody Person person){
        return personService.save(person);
    }
}
