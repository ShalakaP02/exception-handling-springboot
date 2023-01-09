package com.shalaka.exceptionhandling.controller;

import com.shalaka.exceptionhandling.dto.Student;
import com.shalaka.exceptionhandling.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.findAll();
    }

    @GetMapping("/students/{id}")
    public Student findById(@PathVariable int id)  {
        return studentService.findById(id);
    }

}
