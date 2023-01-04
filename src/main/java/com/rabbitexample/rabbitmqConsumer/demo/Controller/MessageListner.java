package com.rabbitexample.rabbitmqConsumer.demo.Controller;

import com.rabbitexample.rabbitmqConsumer.demo.Config.configDetails;
import com.rabbitexample.rabbitmqConsumer.demo.model.Student;
import com.rabbitexample.rabbitmqConsumer.demo.service.StudentService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageListner {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private StudentService studentService;
    @RabbitListener(queues = configDetails.MYQUEUE)
    public void messageListner(Student student){

        System.out.println(student);
        studentService.addStudent(student);

    }
}
