package com.pividori.Veterinaria.models;

import com.pividori.Veterinaria.enums.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Employee extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String dni, String nationality, Gender gender, LocalDate birthdate, String email, String phoneNumber, String address, String lastname, String position, double salary) {
        super(name, dni, nationality, gender, birthdate, email, phoneNumber, address, lastname);
        this.position = position;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
