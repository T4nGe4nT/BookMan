package org.example.bookman.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Books")  // Map to the correct table name
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment for primary key
    @Column(name = "BookID")  // Map the primary key to the "BookID" column
    private Long bookId;

    @NotNull(message = "Title cannot be null")
    @Size(min = 1, message = "Title must have at least 1 character")
    @Column(name = "Title", nullable = false)
    private String title;

    @NotNull(message = "Author cannot be null")
    @Size(min = 1, message = "Author must have at least 1 character")
    @Column(name = "Author", nullable = false)
    private String author;

    @Min(value = 0, message = "Publication year cannot be negative")
    @Column(name = "publication_year", nullable = false)  // Publication year column
    private int publicationYear;

    @Min(value = 0, message = "Price cannot be negative")
    @Column(name = "Price", nullable = false)  // Price column
    private double price;

    // Default constructor
    public Book() {
    }

    // Parameterized constructor
    public Book(String title, String author, int publicationYear, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    // Getters and Setters
    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                '}';
    }
}


