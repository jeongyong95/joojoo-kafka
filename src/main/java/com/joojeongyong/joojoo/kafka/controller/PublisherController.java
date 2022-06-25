package com.joojeongyong.joojoo.kafka.controller;

import com.joojeongyong.joojoo.kafka.message.Sample;
import com.joojeongyong.joojoo.kafka.publisher.MessagePublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping(path = {"api/pub"})
@RestController
public class PublisherController {
    private final MessagePublisher<Sample> sampleMessagePublisher;

    @GetMapping
    public void sendMessage() {
        for (int i = 0; i <100_000; i++) {
            sampleMessagePublisher.send(Sample.of("pubTitle", UUID.randomUUID().toString(), "joojoo"));
        }
    }
}
