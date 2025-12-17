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

    public void setName(string name){
        this.name
    }   

    public string getname(){
        return this.name;
    }
}