package com.school.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.school.studentmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}