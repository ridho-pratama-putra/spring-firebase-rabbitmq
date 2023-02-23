package com.example.springfirebaserabbitmq.services;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FirebaseService {

    final FirebaseMessaging firebaseMessaging;

    public void send(String message) throws FirebaseMessagingException {
        Notification notification = Notification.builder()
                .setTitle("Title from sfrk")
                .setBody("message from sfrk")
                .build();
        Message msg = Message.builder()
                .setNotification(notification)
                .setTopic("TOPIC-SAMPLE")
                .build();
        String send = FirebaseMessaging.getInstance().send(msg);
        System.out.println(send);
    }
}
