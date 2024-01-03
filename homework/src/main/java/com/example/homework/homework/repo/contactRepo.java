package com.example.homework.homework.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.homework.homework.model.contactm;

public interface contactRepo extends MongoRepository<contactm, String> {

}
