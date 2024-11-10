package com.springboot_restapi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_restapi.Entity.Student;
import com.springboot_restapi.Repository.StudentRepository;

// import Entity.Student;


@RestController
public class StudentController {
    @Autowired
    StudentRepository repo;
    //api get all students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students = repo.findAll();
        return students;
    }
    // api to get a student by id
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){
        Student student = repo.findById(id).get();
        return student;
    }
    // creating a new student
    @PostMapping("/student/add")
    public void createStudent(@RequestBody Student student){
        repo.save(student);
    }
    //updating student
    @PutMapping("/student/update/{id}")
    public Student updateStudents(@PathVariable int id){
        Student student = repo.findById(id).get();
        student.setName("kofi");
        student.setPercentage(10);
        student.setBranch("csc");
        repo.save(student);
        return student;
    }
    // deleting a student
    @DeleteMapping("/student/delete/{id}")
    public void deleteStudent(@PathVariable int id){
        Student student = repo.findById(id).get();
        repo.delete(student);        
    }

}
