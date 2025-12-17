package com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class StudentEntity {

    @Id
    @Generatedvalue
    praivate Long id;
    praivate string name;
    praivate string email;
    praivate float cgpa;

}