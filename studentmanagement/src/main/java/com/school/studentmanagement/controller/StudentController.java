package com.school.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.school.studentmanagement.entity.Student;
import com.school.studentmanagement.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping
    public Student addStudent(@RequestBody Student student)
    {
        return service.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents()
    {
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentProfile(@PathVariable Long id)
    {
        return service.getStudentById(id);
    }
}