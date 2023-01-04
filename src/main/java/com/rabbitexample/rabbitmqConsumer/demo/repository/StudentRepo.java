package com.rabbitexample.rabbitmqConsumer.demo.repository;

import com.rabbitexample.rabbitmqConsumer.demo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student,String> {

}
