package com.manager_pbaibol.entitis.reading;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IReadingRepository extends JpaRepository<Reading, Long> {

}
