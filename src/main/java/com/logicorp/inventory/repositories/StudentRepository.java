package com.logicorp.inventory.repositories;

import com.logicorp.inventory.common.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Spring sees this and automatically generates:
    // SELECT * FROM student WHERE last_name = ?
    List<Student> findByLastName(String lastName);
}