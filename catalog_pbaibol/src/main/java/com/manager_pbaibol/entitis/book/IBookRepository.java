package com.manager_pbaibol.entitis.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IBookRepository extends JpaRepository<Book,Long> {

}
