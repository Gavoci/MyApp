package it.itispaleocapa.gavocid.myapp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false, unique = false)
    private String title;
    
    //getter
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}

