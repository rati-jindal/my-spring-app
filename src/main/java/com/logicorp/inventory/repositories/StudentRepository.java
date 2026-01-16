package com.logicorp.inventory.repositories;

import com.logicorp.inventory.common.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Empty!
    // Magic: Spring automatically generates save(), findAll(), findById() for you!
}