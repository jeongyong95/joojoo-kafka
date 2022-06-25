package com.joojeongyong.joojoo.kafka.common;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class LogFormats {

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class PubSub {
        public static final String MESSAGE_INFO = "TOPIC : {}, MESSAGE : {}";
    }
}
