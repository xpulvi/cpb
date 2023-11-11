package com.manager_pbaibol.entitis.person.controller;

import com.manager_pbaibol.entitis.person.Person;
import com.manager_pbaibol.entitis.person.service.PersonService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    protected Person personCreate (@RequestBody Person person){
        personService.createPerson(person);
        return person;
    }

    @GetMapping("/list")
    protected List<Person> personList(){return personService.personList(); }

    @GetMapping("/single_person/{id}")
    protected Person getSinglrPerson(@PathVariable Long id){
        return personService.getSinglePerson(id);
    }

    @DeleteMapping("/delite_single_person/{id}")
    protected String delatePerson (@PathVariable Long id, HttpServletResponse response){


        personService.delatePerson(id);
        response.setStatus(HttpServletResponse.SC_OK);
    return "cancelato " + id + " " + response;
    }


}
