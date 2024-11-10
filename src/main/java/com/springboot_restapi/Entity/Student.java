package com.springboot_restapi.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNO;
    @Column(name="student_name")//if ypu want to give another name
    private String name;
    @Column(name = "student_percentage")
    private float percentage;
    @Column(name = "student_branch")
    private String branch;

    public Student(){

    }
    
    //constructor
    public Student(String name, float percentage, String branch) {
        this.name = name;
        this.percentage = percentage;
        this.branch = branch;
    }

    //generating getters and setters
    public int getRollNO() {
        return rollNO;
    }
    public void setRollNO(int rollNO) {
        this.rollNO = rollNO;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPercentage() {
        return percentage;
    }
    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    // generating tooString
    @Override
    public String toString() {
        return "student [rollNO=" + rollNO + ", name=" + name + ", percentage=" + percentage + ", branch=" + branch
                + "]";
    }
    
}

