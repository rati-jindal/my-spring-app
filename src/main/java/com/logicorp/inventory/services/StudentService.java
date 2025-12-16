package com.logicorp.inventory.services;

import com.logicorp.inventory.common.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getAllStudents() {
        // The business logic lives here now
        return List.of(
                new Student("John", "Doe"),
                new Student("Raina", "Smith")
        );
    }
}
