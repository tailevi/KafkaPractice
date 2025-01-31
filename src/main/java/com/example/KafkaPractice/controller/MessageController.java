package com.example.KafkaPractice.controller;

import com.example.KafkaPractice.requests.MessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {


    private KafkaTemplate<String,String> kafkaTemplate;
    @Autowired
    public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    //POST http://localhost:8081/api/v1/messages/publish
    @PostMapping("/publish")
    public void publish(@RequestBody MessageRequest request){
        kafkaTemplate.send("logSubmission",request.getMessage());
    }

}
