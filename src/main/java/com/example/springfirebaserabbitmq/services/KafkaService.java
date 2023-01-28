package com.example.springfirebaserabbitmq.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @KafkaListener(topics = "MUSIC_RECOMMENDATION", groupId = "SPRING-FIREBASE-RABBITMQ-KAFKA")
    public void listener(String message) {
        System.out.println(message);
    }
}
