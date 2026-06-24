package com.kafka_consumer.consumer.service;

import com.kafka_consumer.consumer.dto.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMsgListener {


    Logger log = LoggerFactory.getLogger(KafkaMsgListener.class);
    // to receive msg from kafka

    @KafkaListener(topics = "KafkaTest", groupId = "consumer-groupid1")
    public void consumeMsg(String message) {
        log.info("consumer receive message {}", message);
    }


    @KafkaListener(topics = "consumerTopic", groupId = "consumer-groupid2")
    public void consumerEvent(Employee employee) {
        log.info("consumer receive message  from publisher : object data  {}", employee.toString());

    }




}
