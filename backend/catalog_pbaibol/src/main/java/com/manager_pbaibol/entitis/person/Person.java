package com.manager_pbaibol.entitis.person;

import com.manager_pbaibol.entitis.city.City;

import com.manager_pbaibol.entitis.relatives.Relatives;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "person")
public class Person  extends PersonBase{



    private String name;

    private String descriptib_name;

    private String surname;

    private String nikename;

    private int age_at_death;

    //first_time_appears_here_the_Bible
    private String first_appears;
    @OneToMany(mappedBy = "person")
    private List<Relatives> relatives;

    //city to abitate
    @ManyToMany
    private List <City> cityList;

    public Person(){};


    public Person(String name, String descriptib_name, String surname,
                  String nikename, int age_at_death, String first_appears) {

        this.name = name;
        this.descriptib_name = descriptib_name;
        this.surname = surname;
        this.nikename = nikename;
        this.age_at_death = age_at_death;
        this.first_appears = first_appears;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptib_name() {
        return descriptib_name;
    }

    public void setDescriptib_name(String descriptib_name) {
        this.descriptib_name = descriptib_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename;
    }

    public int getAge_at_death() {
        return age_at_death;
    }

    public void setAge_at_death(int age_at_death) {
        this.age_at_death = age_at_death;
    }

    public String getFirst_appears() {
        return first_appears;
    }

    public void setFirst_appears(String first_appears) {
        this.first_appears = first_appears;
    }
}
