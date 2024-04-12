package com.manager_pbaibol.entitis.person.controller;

import com.manager_pbaibol.entitis.person.Person;
import com.manager_pbaibol.entitis.person.service.PersonService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/insert")
    protected Person personCreate (@RequestBody Person person){
        personService.createPerson(person);
        return person;
    }

    @PatchMapping("/update/{id}")
    protected Person patchPerson(@PathVariable Long id, @RequestBody Person person){

        return personService.patchPerson(id, person);
    }

    /**
     * used tis metodo for deleting person.
     * new person. mannite the Old id
     * but delete the person to whom that id was associated with the new person.
     * @param id
     * @param person
     * @return new person.
     */
    @PutMapping("/put/{id}")
    protected Person putPerson(@PathVariable Long id, @RequestBody Person person){
        personService.putSinglePerson(id, person);
        return person;
    }


    @GetMapping("/list")
    protected List<Person> personList(){return personService.personList(); }

    @GetMapping("/view/{id}")
    protected Optional<Person> getSinglrPerson(@PathVariable Long id) throws Exception {
        return personService.getSinglePerson(id);
    }

    @DeleteMapping("/delite/{id}")
    protected String delatePerson (@PathVariable Long id, HttpServletResponse response){


        personService.delatePerson(id);
        response.setStatus(HttpServletResponse.SC_OK);
    return "cancelato " + id + " " + response;
    }


}
