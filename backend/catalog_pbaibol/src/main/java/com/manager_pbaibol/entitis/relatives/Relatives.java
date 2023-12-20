package com.manager_pbaibol.entitis.relatives;

import com.manager_pbaibol.entitis.person.Person;
import jakarta.persistence.*;

@Entity
@Table(name = "relatives")
public class Relatives {

    @Id
    private Long idRelative;

    private String relativeName;
    //name sobgiet
    private String relationship;

    //TODO rimuovere qusta colona inutile. JoinColumn mi piaceva averlo (funzionante) pero.
    @ManyToOne
    @JoinColumn(name = "idPerson")
    private Person person;

    private Long personId;
    private String namePerson;

    //-----------------------------------------
    public Relatives(){}
    public Relatives(Long personId, String namePerson, String relationship,Long idRelative, String relativeName){

        this.personId = personId;
        this.namePerson = namePerson;
        this.relationship = relationship;
        this.idRelative = idRelative;
        this.relativeName = relativeName;

    }

    public Long getIdRelative() {
        return idRelative;
    }

    public void setIdRelative(Long idRelative) {
        this.idRelative = idRelative;
    }

    public String getRelativeName() {
        return relativeName;
    }

    public void setRelativeName(String relativeName) {
        this.relativeName = relativeName;
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

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }
}