package com.pividori.Veterinaria.models;

import com.pividori.Veterinaria.enums.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDate;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class Person {

    protected String name;
    protected String lastname;
    protected String address;
    protected String phoneNumber;
    protected String email;
    protected LocalDate birthdate;
    @Enumerated(EnumType.STRING)
    protected Gender gender;
    protected String nationality;
    protected String dni;
    protected LocalDateTime createdAt;

    public Person() {
    }

    public Person(String name, String lastname, String phoneNumber) {
        this.name = name;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.createdAt = LocalDateTime.now();
    }

    public Person(String name, String dni, String nationality, Gender gender, LocalDate birthdate, String email, String phoneNumber, String address, String lastname) {
        this.name = name;
        this.dni = dni;
        this.nationality = nationality;
        this.gender = gender;
        this.birthdate = birthdate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.lastname = lastname;
        this.createdAt = LocalDateTime.now();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
