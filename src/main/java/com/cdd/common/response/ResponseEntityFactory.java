package com.cdd.common.response;

import com.cdd.common.exception.CallConstructorException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseEntityFactory {

    private ResponseEntityFactory() {
        throw new CallConstructorException();
    }

    public static ResponseEntity<MessageBody<Void>> ok(
            String message
    ) {
        return ResponseEntity.ok(MessageBody.of(message, null));
    }

    public static <T> ResponseEntity<MessageBody<T>> ok(
            String message,
            T body
    ) {
        return ResponseEntity.ok(MessageBody.of(message, body));
    }


    public static ResponseEntity<MessageBody<Void>> created(
            String message
    ) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(MessageBody.of(message, null));
    }

    public static <T> ResponseEntity<MessageBody<T>> created(
            String message,
            T body
    ) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(MessageBody.of(message, body));
    }


    public static ResponseEntity<MessageBody<Void>> status(
            int status,
            String message
    ) {
        return ResponseEntity.status(status)
                .body(MessageBody.of(message, null));
    }

    public static <T> ResponseEntity<MessageBody<T>> status(
            int status,
            String message,
            T body
    ) {
        return ResponseEntity.status(status)
                .body(MessageBody.of(message, body));
    }

    public static ResponseEntity<MessageBody<Void>> status(
            HttpStatus status,
            String message
    ) {
        return ResponseEntity.status(status)
                .body(MessageBody.of(message, null));
    }

    public static <T> ResponseEntity<MessageBody<T>> status(
            HttpStatus status,
            String message,
            T body
    ) {
        return ResponseEntity.status(status)
                .body(MessageBody.of(message, body));
    }
}
