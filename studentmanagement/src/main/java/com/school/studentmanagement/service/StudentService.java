package com.school.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.studentmanagement.entity.Student;
import com.school.studentmanagement.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;

    public Student saveStudent(Student student)
    {
        return repo.save(student);
    }

    public List<Student> getAllStudents()
    {
        return repo.findAll();
    }

    public Student getStudentById(Long id)
    {
        Optional<Student> student = repo.findById(id);
        return student.orElse(null);
    }
}