package com.manager_pbaibol.entitis.relatives;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IRelativesRepository extends JpaRepository<Relatives,Long> {
}
