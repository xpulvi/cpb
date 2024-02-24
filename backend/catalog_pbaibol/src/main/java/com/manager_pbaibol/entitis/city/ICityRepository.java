package com.manager_pbaibol.entitis.city;

import com.manager_pbaibol.entitis.city.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface ICityRepository extends JpaRepository<City,Long> {

    City findByName(String name);

}
