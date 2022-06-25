package com.joojeongyong.joojoo.kafka.publisher;

import com.joojeongyong.joojoo.kafka.common.LogFormats;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;

@Slf4j
@RequiredArgsConstructor
public class MessagePublisher<T> {
    private final String TOPIC;
    private final Class<T> targetClass;
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void send(T message) {
        log.info(LogFormats.PubSub.MESSAGE_INFO, this.TOPIC, message);
        kafkaTemplate.send(TOPIC, message);
    }
}
