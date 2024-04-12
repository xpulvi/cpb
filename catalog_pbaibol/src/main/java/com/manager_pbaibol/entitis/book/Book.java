package com.manager_pbaibol.entitis.book;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.lang.NonNull;

import com.manager_pbaibol.entitis.collection.Collection;
import com.manager_pbaibol.entitis.person.Person;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_book;
    @NonNull
    private String title;
    private String author;
    /*TODO @ie dimi se va bene cosi ho devo metere altro. iserito bug Integer
    ma servirebe altro */
    
    private Date YearPublication;
    private String genre;
    //personagi lista
//    private List<Person> personList;
    private String cover;

    @ManyToOne
    @JoinColumn(name = "id_collection")
    private Collection collection;

    public Book(){}
/*    
    public Book(Long id_book, String title, Optional<String> author, Optional<Date> yearPublication,
                Optional<String> genre, Optional<List<Person>> personList, Optional<String> cover) {
        this.id_book = id_book;
        this.title = title;
        this.author = author;
        YearPublication = yearPublication;
        this.genre = genre;
        this.personList = personList;
        this.cover = cover;
    }
*/

	public Long getId_book() {
		return id_book;
	}

	public void setId_book(Long id_book) {
		this.id_book = id_book;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getYearPublication() {
		return YearPublication;
	}

	public void setYearPublication(Date yearPublication) {
		YearPublication = yearPublication;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public Collection getCollection() {
		return collection;
	}

	public void setCollection(Collection collection) {
		this.collection = collection;
	}
    
}