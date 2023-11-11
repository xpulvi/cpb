package com.manager_pbaibol.entitis.person.service;

import com.manager_pbaibol.entitis.person.Person;
import com.manager_pbaibol.entitis.person.repository.IPersonRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired private IPersonRepository iPersonRepository;

    public Person createPerson(Person person){
        Person personSave = iPersonRepository.save(person);
        return personSave;
    }

    //public cekParental

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
