package com.example.userjwtregister.services.impl;

import com.example.userjwtregister.model.User;
import com.example.userjwtregister.services.RabbitMqSender;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqSenderImpl implements RabbitMqSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${rabbitmq.exchange}")
    private String exchange;

    @Value("${rabbitmq.routingkey}")
    private String routingKey;

    @Override
    public void send(User user) {
        this.amqpTemplate.convertAndSend(this.exchange, this.routingKey, user);
        System.out.println("Published in queue!");
    }
}
