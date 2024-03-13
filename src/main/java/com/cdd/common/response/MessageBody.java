package com.cdd.common.response;

import com.cdd.common.exception.CallConstructorException;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageBody<T> {
    @JsonProperty("message")
    private String message;
    @JsonProperty("body")
    private T body;

    private MessageBody() {
        throw new CallConstructorException();
    }

    private MessageBody(
            String message,
            T body) {
        this.message = message;
        this.body = body;
    }

    public static <T> MessageBody<T> of(String message, T body) {
        return new MessageBody<>(message, body);
    }
}
