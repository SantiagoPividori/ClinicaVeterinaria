package com.pividori.Veterinaria.models;

import com.pividori.Veterinaria.enums.Gender;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Client extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private List<LocalDate> visit;
    @OneToMany(mappedBy = "owner")
    private List<Pet> pets;

    public Client() {
    }

    public Client(String name, String lastname, String phoneNumber, List<Pet> pets, LocalDate visit) {
        super(name, lastname, phoneNumber);
        this.pets = pets;
        this.visit.add(visit);
    }

    public Client(String name, String dni, String nationality, Gender gender, LocalDate birthdate, String email, String phoneNumber, String address, String lastname, LocalDate visit, List<Pet> pets) {
        super(name, dni, nationality, gender, birthdate, email, phoneNumber, address, lastname);
        this.visit.add(visit);
        this.pets = pets;
    }

    public Client(String name, String dni, String nationality, Gender gender, LocalDate birthdate, String email, String phoneNumber, String address, String lastname, LocalDate visit, Pet pets) {
        super(name, dni, nationality, gender, birthdate, email, phoneNumber, address, lastname);
        this.visit.add(visit);
        this.pets.add(pets);
    }

    public Long getId() {
        return id;
    }

    public List<LocalDate> getVisit() {
        return visit;
    }

    public void setVisit(List<LocalDate> visit) {
        this.visit = visit;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
