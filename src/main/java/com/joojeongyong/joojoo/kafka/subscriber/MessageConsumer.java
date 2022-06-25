package com.joojeongyong.joojoo.kafka.subscriber;

import com.joojeongyong.joojoo.kafka.common.LogFormats;
import com.joojeongyong.joojoo.kafka.message.MessageTopics;
import com.joojeongyong.joojoo.kafka.message.Sample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class MessageConsumer {

    @KafkaListener(topics = {MessageTopics.SAMPLE_MESSAGE}, concurrency = "10", groupId = "1", containerGroup = "joojoo-sample-consumer")
    public void consume(List<Sample> messages) {
        messages.forEach(message -> log.info("consume : " + LogFormats.PubSub.MESSAGE_INFO, MessageTopics.SAMPLE_MESSAGE, message.getContent()));
    }
}
