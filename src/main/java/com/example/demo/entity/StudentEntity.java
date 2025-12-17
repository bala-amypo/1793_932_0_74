package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy - generationType.IDENTITY)
    praivate Long id;
    praivate string name;
    praivate string email;
    praivate float cgpa;

    public StudentEntity(Long id, string name, string email, float cgpa){
        this.id = id;
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }

    public void setName(string name){
        this.name;
    }   

    public string getname(string name){
        return this.name;
    }

    public void setEmail(string email){
         this.name;
    }

    public void getEmail( string email){
        return this.email;
    }

    public void setcgpa(float cgpa){
        this.cgpa;
    }

    public void getcgpa(float cgpa){
        return this.cgpa;
    }

}