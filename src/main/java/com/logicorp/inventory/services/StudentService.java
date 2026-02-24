package com.logicorp.inventory.services;

import com.logicorp.inventory.common.Student;
import com.logicorp.inventory.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    // --- ADD THIS NEW METHOD ---
    public List<Student> searchByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

    // Add this inside StudentService
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }

    public Student updateStudent(Long id, Student updatedDetails) {
        // 1. Find the existing student, or crash if they don't exist
        Student existingStudent = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student with ID " + id + " not found!"));

        // 2. Update the fields
        existingStudent.setFirstName(updatedDetails.getFirstName());
        existingStudent.setLastName(updatedDetails.getLastName());

        // 3. Save and return the updated student
        return repository.save(existingStudent);
    }
}