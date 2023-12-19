package com.manager_pbaibol.entitis.relatives;


import com.manager_pbaibol.entitis.person.Person;
import com.manager_pbaibol.entitis.person.repository.IPersonRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@Entity
@Table(name = "relatives")
public class Relatives {

    @Id
    private Long idRelative;
    //name sobgiet
    private String relationship;
    //fare una join
    //private Optional<>
    @ManyToOne
    @JoinColumn(name = "idPerson")
    private Person person;


    //-----------------------------------------
 //IPersonRepository iPersonRepository;
    public Relatives(){}

    public Relatives(Long id, String relationship, Long idRelative){

        this.relationship = relationship;
        this.idRelative = idRelative;
       /* if(iPersonRepository.existsById(id)) {

            Person existingPerson = iPersonRepository.getReferenceById(id);
              this.person = existingPerson;
        }else {
            System.out.println("L'oggetto Person con ID " + id + " non esiste.");
        }*/
    }

    //TODO erorre progetazione costrutore realtives.
    public Relatives(Person person, String relationship, Long idRelative) {

        this.person = person;
        this.idRelative = idRelative;
        this.relationship = relationship;
    }

    public Long getIdRelative() {
        return idRelative;
    }

    public void setIdRelative(Long idRelative) {
        this.idRelative = idRelative;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
