package com.joojeongyong.joojoo.kafka.message;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Sample {
    private String title;
    private String content;
    private String author;
    private LocalDateTime publishedAt;

    public static Sample of(String title, String content, String author) {
        return new Sample(title, content, author, LocalDateTime.now());
    }
}
