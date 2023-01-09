package com.shalaka.exceptionhandling.service;

import com.shalaka.exceptionhandling.dto.Student;
import com.shalaka.exceptionhandling.exception.UserNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {

   private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1,"Shalaka"));
        studentList.add(new Student(2,"Dipen"));
        studentList.add(new Student(3, "Apoorva"));

    }

    public List<Student> findAll(){
        return studentList;
    }

    public Student findById(int id){
        return studentList.stream().filter(stud -> stud.getId() == id).findFirst().orElseThrow(() -> new UserNotFoundException("Specified User not found "+id));
    }


}
