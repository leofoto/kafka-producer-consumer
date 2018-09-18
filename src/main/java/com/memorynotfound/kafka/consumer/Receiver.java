package com.memorynotfound.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Receiver {

    private static final Logger LOG = LoggerFactory.getLogger(Receiver.class);

//    @KafkaListener(topics = "${app.topic.compact-topic}")
//    public void listen(@Payload String message
//    ,@Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) Integer key) {
//        LOG.info("received key={}, message='{}'", key,message);
//    }

}
