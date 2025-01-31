package com.example.KafkaPractice.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class LogListeners {

    @KafkaListener(
            topics = "logSubmission",
            groupId = "groupId"
    )
    void listener(String data){
        System.out.println("received: " + data);
    }
}
