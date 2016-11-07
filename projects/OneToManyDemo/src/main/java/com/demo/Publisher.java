package com.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Hue on 10/28/2016.
 */
@Entity
@Table(name = "publisher")
public class Publisher {

    private int id;
    private String name;
    private Set<Book> books;

    public Publisher(){

    }

    public Publisher(String name){
        this.name = name;
    }

    public Publisher(String name, Set<Book> books){
        this.name = name;
        this.books = books;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "publishers", fetch = FetchType.LAZY)
    @JsonIgnore
    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
