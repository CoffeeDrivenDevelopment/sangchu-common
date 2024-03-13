package com.cdd.common.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse<T> {
    @JsonProperty("message")
    private String message;

    @JsonProperty("body")
    private T body;

    public String getMessage() {
        return message;
    }

    public T getBody() {
        return body;
    }
}
