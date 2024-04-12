package com.manager_pbaibol.entitis.collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ICollectionRepository extends JpaRepository<Collection, Long> {



}
