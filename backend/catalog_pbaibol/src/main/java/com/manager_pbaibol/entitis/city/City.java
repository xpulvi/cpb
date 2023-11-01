package com.manager_pbaibol.entitis.city;

import com.manager_pbaibol.entitis.person.Person;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.List;

@Entity
@Table
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String name;

    private int create_date;

    private int destroi_date;

    private String fondatore_city;

    private String nait;

    private String pawns_of_nait;

    private String name_now;

    @ManyToMany
    private List <Person> person;

    private City(){};
    public City(@NonNull String name, int create_date, int destroi_date, String fondatore_city, String nait,
                String pawns_of_nait, String name_now) {
        this.name = name;
        this.create_date = create_date;
        this.destroi_date = destroi_date;
        this.fondatore_city = fondatore_city;
        this.nait = nait;
        this.pawns_of_nait = pawns_of_nait;
        this.name_now = name_now;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public int getCreate_date() {
        return create_date;
    }

    public void setCreate_date(int create_date) {
        this.create_date = create_date;
    }

    public int getDestroi_date() {
        return destroi_date;
    }

    public void setDestroi_date(int destroi_date) {
        this.destroi_date = destroi_date;
    }

    public String getFondatore_city() {
        return fondatore_city;
    }

    public void setFondatore_city(String fondatore_city) {
        this.fondatore_city = fondatore_city;
    }

    public String getNait() {
        return nait;
    }

    public void setNait(String nait) {
        this.nait = nait;
    }

    public String getPawns_of_nait() {
        return pawns_of_nait;
    }

    public void setPawns_of_nait(String pawns_of_nait) {
        this.pawns_of_nait = pawns_of_nait;
    }

    public String getName_now() {
        return name_now;
    }

    public void setName_now(String name_now) {
        this.name_now = name_now;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", create_date=" + create_date +
                ", destroi_date=" + destroi_date +
                ", fondatore_city='" + fondatore_city + '\'' +
                ", nait='" + nait + '\'' +
                ", pawns_of_nait='" + pawns_of_nait + '\'' +
                ", name_now='" + name_now + '\'' +
                '}';
    }
}
