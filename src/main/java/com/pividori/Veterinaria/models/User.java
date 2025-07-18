package com.pividori.Veterinaria.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    String lastname;
    List<Pet> pets;

    public User(){
    }

    public User(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public User(String name, String lastname, List<Pet> pets){
        this.name = name;
        this.lastname = lastname;
        this.pets = pets;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
