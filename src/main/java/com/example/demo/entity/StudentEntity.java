package com.example.demo.entity;

import jakarta.persistence.Entity;
akarta.persistence.GeneratedValue;
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

}