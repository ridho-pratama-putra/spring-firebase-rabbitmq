package com.example.springfirebaserabbitmq.services;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FirebaseService {

    final FirebaseMessaging firebaseMessaging;

    public void send(String message) throws FirebaseMessagingException {
        Message msg = Message.builder()
                .setTopic("TOPIC-SAMPLE")
                .putData("body", message)
                .build();
        String sendResult = firebaseMessaging.send(msg);
        System.out.println(sendResult);
    }
}
