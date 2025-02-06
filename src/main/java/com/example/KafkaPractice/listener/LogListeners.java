package com.example.KafkaPractice.listener;

import com.example.KafkaPractice.entity.Message;
import com.example.KafkaPractice.repositories.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class LogListeners {

    @Autowired
    private MessageRepo messageRepository;
    @KafkaListener(
            topics = "logSubmission",
            groupId = "groupId"
    )
   void listener(String data){
        System.out.println("received: " + data);
        Message message = new Message();
        message.setContent(data);
         messageRepository.save(message);
    }
}
