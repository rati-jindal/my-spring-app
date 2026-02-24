package com.logicorp.inventory.controllers;

import com.logicorp.inventory.common.Student;
import com.logicorp.inventory.services.StudentService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getStudents() {
        return service.getAllStudents();
    }

    @PostMapping
    public Student createStudent(@Valid @RequestBody Student student) {
        return service.saveStudent(student);
    }

    // --- ADD THIS NEW ENDPOINT ---
    // URL will be: http://localhost:9090/students/search?name=Messi
    @GetMapping("/search")
    public List<Student> searchStudents(@RequestParam String name) {
        return service.searchByLastName(name);
    }

    // Add this inside StudentController
// URL will be: DELETE http://localhost:9090/students/2
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
    }

    // URL will be: PUT http://localhost:9090/students/1
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @Valid @RequestBody Student studentDetails) {
        return service.updateStudent(id, studentDetails);
    }
}