package com.meditech.model;

import jakarta.persistence.*;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String disease;
    private int age;

    // Default Constructor
    public Patient() {}

    // Parameterized Constructor
    public Patient(String name, String disease, int age) {
        this.name = name;
        this.disease = disease;
        this.age = age;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDisease() { return disease; }
    public void setDisease(String disease) { this.disease = disease; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
