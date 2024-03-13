package com.cdd.common.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MessageBody<T>(
        @JsonProperty("message")
        String message,
        @JsonProperty("body")
        T body
) {
    public static <T> MessageBody<T> of(String message, T body) {
        return new MessageBody<>(message, body);
    }
}
