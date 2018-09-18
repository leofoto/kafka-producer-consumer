package com.memorynotfound.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Sender {

    private static final Logger LOG = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${app.topic.non-compact-topic}")
    private String nonCompactTopic;

    @Value("${app.topic.compact-topic}")
    private String compactTopic;

    public void send(String key, String message){
        LOG.info("sending key={}, message='{}' to compactTopic='{}'", key,message, compactTopic);
        kafkaTemplate.send(compactTopic,key, message);
    }
}
