package com.example.springfirebaserabbitmq.services;

import com.google.firebase.messaging.FirebaseMessagingException;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaService {

    final FirebaseService firebaseService;

    @KafkaListener(topics = "MUSIC_RECOMMENDATION", groupId = "SPRING-FIREBASE-RABBITMQ-KAFKA")
    public void listener(String message) throws FirebaseMessagingException {
        System.out.println(message);
        firebaseService.send(message);
    }
}
