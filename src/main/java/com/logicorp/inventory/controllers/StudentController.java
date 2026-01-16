package com.logicorp.inventory.controllers;

import com.logicorp.inventory.common.Student;
import com.logicorp.inventory.services.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    // Constructor Injection: Spring gives us the Service
    public StudentController(StudentService service) {
        this.service = service;
    }

    // GET http://localhost:8080/students
    @GetMapping
    public List<Student> getStudents() {
        return service.getAllStudents();
    }

    // POST http://localhost:8080/students
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }
}