package com.logicorp.inventory.services;

import com.logicorp.inventory.common.Student;
import com.logicorp.inventory.repositories.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    // Constructor Injection: Spring gives us the Repository
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAllStudents() {
        // JPA Magic: SELECT * FROM student
        return repository.findAll();
    }

    public Student saveStudent(Student student) {
        // JPA Magic: INSERT INTO student ...
        return repository.save(student);
    }
}