package com.logicorp.inventory.common; // (Or wherever your Student class is)

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // 1. Maps this class to a Database Table
public class Student {

    @Id // 2. This is the Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 3. Auto-Increment (1, 2, 3...)
    private Long id;

    private String firstName;
    private String lastName;

    // Required by JPA: A Default (Empty) Constructor
    public Student() {}

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and Setters...
    public Long getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
}