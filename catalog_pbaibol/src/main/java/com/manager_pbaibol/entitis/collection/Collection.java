package com.manager_pbaibol.entitis.collection;

import java.util.List;

import com.manager_pbaibol.entitis.book.Book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Collection {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_collection;
    private String title;
    @OneToMany()
    private List<Book> book;

    public Collection(){}

    public Collection(Long id, String title, List<Book> book) {
        this.id_collection = id;
        this.title = title;
        this.book = book;
    }

    public Long getId() {
        return id_collection;
    }

    public void setId(Long id) {
        this.id_collection = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

}
