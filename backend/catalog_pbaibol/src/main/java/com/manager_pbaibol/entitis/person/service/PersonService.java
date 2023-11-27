package com.manager_pbaibol.entitis.person.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.manager_pbaibol.entitis.person.Person;
import com.manager_pbaibol.entitis.person.repository.IPersonRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PersonService {

    @Autowired private IPersonRepository iPersonRepository;

    public Person createPerson(Person person){
        Person personSave = iPersonRepository.save(person);
        return personSave;
    }

    public Person patchPerson(Long id, Person person){
        Person existingPerson = iPersonRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Person not found with id: " + id));

        if (person.getName() != null){
            existingPerson.setName(person.getName());
        }

        if (person.getDescriptib_name() != null){
            existingPerson.setDescriptib_name(person.getDescriptib_name());
        }

        if (person.getSurname() != null){
            existingPerson.setSurname(person.getSurname());
        }

        if (person.getNikename() != null){
            existingPerson.setNikename(person.getNikename());
        }

        if (person.getAge_at_death() != 0){
            existingPerson.setAge_at_death(person.getAge_at_death());
        }

        if (person.getFirst_appears() != null){
            existingPerson.setFirst_appears(person.getFirst_appears());
        }

        return iPersonRepository.save(existingPerson);

    }



    //public cekParental

    /**
     * modeifay existing person
     * @param id
     * @param person
     * @return
     */
    public Person putSinglePerson(Long id, Person person){
        person.setIdPerson(id);
        Person newPerson = iPersonRepository.save(person);
        return newPerson;
    }

    public List<Person> personList(){
        List<Person> customerList = iPersonRepository.findAll();
        return customerList;
    }

    public Person getSinglePerson(Long id){
        if (iPersonRepository.existsById(id)){
            Person singlePerson = iPersonRepository.getReferenceById(id);
            return singlePerson;
        }else {
            System.out.println("non esiste");
        }
        return null;
    }

    public String delatePerson(Long id){
        //HttpServletResponse response = null;
        if (iPersonRepository.existsById(id)) {
             iPersonRepository.deleteById(id);
           // response.setStatus(HttpServletResponse.SC_OK);
            return id + ": delate" ;
        }else {
            System.out.println("va che non ce sto id " + id);
            //response.setStatus(HttpServletResponse.SC_CONFLICT);
            return ""; // Restituisci una stringa vuota in caso di conflitto
        }
    }

}
