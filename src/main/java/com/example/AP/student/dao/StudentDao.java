package com.example.AP.student.dao;

import com.example.AP.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao  extends JpaRepository<Student, Long> {
}
