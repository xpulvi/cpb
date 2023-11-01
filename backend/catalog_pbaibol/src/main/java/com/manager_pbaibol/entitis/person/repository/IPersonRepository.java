package com.manager_pbaibol.entitis.person.repository;

import com.manager_pbaibol.entitis.person.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface IPersonRepository extends JpaRepository<Person, Long> {

}
