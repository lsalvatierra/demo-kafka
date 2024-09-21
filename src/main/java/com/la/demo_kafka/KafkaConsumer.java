package com.la.demo_kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "topic_cibertec", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Mensaje recibido desde Kafka: " + message);
    }
}
