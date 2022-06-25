package com.joojeongyong.joojoo.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JoojooKafkaApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(JoojooKafkaApplication.class);
        application.run(args);
    }
}
