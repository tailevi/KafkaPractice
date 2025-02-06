package com.example.KafkaPractice.repositories;

import com.example.KafkaPractice.entity.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepo extends MongoRepository<Message, String> {
}
