package com.la.demo_kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "topic_cibertec";

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
        System.out.println("Mensaje enviado a Kafka: " + message);
    }
}