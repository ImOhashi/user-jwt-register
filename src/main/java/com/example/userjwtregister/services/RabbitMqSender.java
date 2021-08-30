package com.example.userjwtregister.services;

import com.example.userjwtregister.model.User;

public interface RabbitMqSender {
    void send(User user);
}
