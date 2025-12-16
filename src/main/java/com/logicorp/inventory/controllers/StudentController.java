package com.logicorp.inventory.controllers;

import com.logicorp.inventory.common.Student;
import com.logicorp.inventory.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getStudents() {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("John", "Doe"));
//        students.add(new Student("Jane", "Smith"));
//        return students;
        return studentService.getAllStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student students) {
        // In a real application, you would save the student to a database
        return students; // Echo back the received student for demonstration
    }

}

