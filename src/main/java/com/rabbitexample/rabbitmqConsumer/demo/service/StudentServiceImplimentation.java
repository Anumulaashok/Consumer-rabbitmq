package com.rabbitexample.rabbitmqConsumer.demo.service;

import com.rabbitexample.rabbitmqConsumer.demo.model.Student;
import com.rabbitexample.rabbitmqConsumer.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplimentation implements  StudentService {

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }
}
