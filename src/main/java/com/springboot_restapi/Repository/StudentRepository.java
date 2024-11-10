package com.springboot_restapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot_restapi.Entity.Student;

// import Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer >{
    
}
