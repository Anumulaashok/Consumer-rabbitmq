package com.rabbitexample.rabbitmqConsumer.demo.Config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

    @Bean
    public Queue queue(){
        return new Queue(configDetails.MYQUEUE);
    }
    @Bean
    public TopicExchange exchange(){return new TopicExchange(configDetails.MYEXCHANGE);}
    @Bean
    public Binding binding(Queue queue,TopicExchange topicExchange){
        return BindingBuilder
                .bind(queue)
                .to(topicExchange)
                .with(configDetails.ROUTING_KEY);
    }

    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }

}
