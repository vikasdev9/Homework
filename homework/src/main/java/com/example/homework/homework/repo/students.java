package com.example.homework.homework.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.homework.homework.model.Student;

public interface students extends MongoRepository<Student, String> {

}
