package com.manager_pbaibol.entitis.person;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class PersonBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPerson;

    private LocalDate dob;

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public boolean isNew(){
        return this.idPerson == null;
    }



}
