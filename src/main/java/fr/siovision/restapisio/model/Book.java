package fr.siovision.restapisio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "year")
    private int year;

    @Column(name = "isbn")
    private String isbn;

    public Book() {
    }

    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public int getYear() {
    	return year;
    }

    public void setYear(int year) {
    	this.year = year;
    }

    public String getIsbn() {
    	return isbn;
    }

    public void setIsbn(String isbn) {
    	this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author +
        		", year=" + year + ", isbn=" + isbn + "]";
    }
}
