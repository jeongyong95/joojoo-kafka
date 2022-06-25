package com.joojeongyong.joojoo.kafka.configuration;

import com.joojeongyong.joojoo.kafka.message.MessageTopics;
import com.joojeongyong.joojoo.kafka.message.Sample;
import com.joojeongyong.joojoo.kafka.publisher.MessagePublisher;

import lombok.RequiredArgsConstructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

@RequiredArgsConstructor
@Configuration
public class KafkaProducerConfig {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Bean
    public MessagePublisher<Sample> sampleMessagePublisher() {
        return new MessagePublisher<>(MessageTopics.SAMPLE_MESSAGE, Sample.class, kafkaTemplate);
    }
}
