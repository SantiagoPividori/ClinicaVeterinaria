package com.pividori.Veterinaria.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate birthday;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    public Pet() {
    }

    public Pet(String name, LocalDate birthday, User owner) {
        this.name = name;
        this.owner = owner;
        this.birthday = birthday;
    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

}
