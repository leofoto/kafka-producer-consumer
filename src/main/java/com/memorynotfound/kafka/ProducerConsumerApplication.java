package com.memorynotfound.kafka;

import com.memorynotfound.kafka.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerConsumerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProducerConsumerApplication.class, args);
    }

    @Autowired
    private Sender sender;

    @Override
    public void run(String... strings) throws Exception {
        String data = "Spring Kafka Producer and Consumer Example";
        for (int j = 0; j < 30000; j++) {
            for (int i = 0; i < 20; i++) {
                sender.send(new Integer(i).toString(), data + i);
            }
        }
    }

}