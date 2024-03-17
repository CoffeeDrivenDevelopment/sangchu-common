package com.cdd.common.response;

import com.cdd.common.exception.CallConstructorException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseEntityFactoryWithHeaders {

    private ResponseEntityFactoryWithHeaders() {
        throw new CallConstructorException();
    }

    public static ResponseEntity<MessageBody<Void>> ok(
            HttpHeaders headers,
            String message
    ) {
        return ResponseEntity.ok()
                .headers(headers)
                .body(MessageBody.of(message, null));
    }

    public static <T> ResponseEntity<MessageBody<T>> ok(
            HttpHeaders headers,
            String message,
            T body
    ) {
        return ResponseEntity.ok()
                .headers(headers)
                .body(MessageBody.of(message, body));
    }

    public static ResponseEntity<MessageBody<Void>> created(
            HttpHeaders headers,
            String message
    ) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .headers(headers)
                .body(MessageBody.of(message, null));
    }

    public static <T> ResponseEntity<MessageBody<T>> created(
            HttpHeaders headers,
            String message,
            T body
    ) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .headers(headers)
                .body(MessageBody.of(message, body));
    }

    public static ResponseEntity<MessageBody<Void>> status(
            int status,
            HttpHeaders headers,
            String message
    ) {
        return ResponseEntity.status(status)
                .headers(headers)
                .body(MessageBody.of(message, null));
    }

    public static <T> ResponseEntity<MessageBody<T>> status(
            int status,
            HttpHeaders headers,
            String message,
            T body
    ) {
        return ResponseEntity.status(status)
                .headers(headers)
                .body(MessageBody.of(message, body));
    }

    public static ResponseEntity<MessageBody<Void>> status(
            HttpStatus status,
            HttpHeaders headers,
            String message
    ) {
        return ResponseEntity.status(status)
                .headers(headers)
                .body(MessageBody.of(message, null));
    }

    public static <T> ResponseEntity<MessageBody<T>> status(
            HttpStatus status,
            HttpHeaders headers,
            String message,
            T body
    ) {
        return ResponseEntity.status(status)
                .headers(headers)
                .body(MessageBody.of(message, body));
    }
}
