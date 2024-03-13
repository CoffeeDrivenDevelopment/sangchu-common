package com.cdd.common.response;

import com.cdd.common.exception.CallConstructorException;
import com.cdd.common.exception.ErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseEntityFactory {

    private ResponseEntityFactory() {
        throw new CallConstructorException();
    }

    public static <T> ResponseEntity<MessageBody<T>> ok(String message, T body) {
        return ResponseEntity.ok(MessageBody.of(message, body));
    }

    public static <T> ResponseEntity<MessageBody<T>> created(
            String message,
            T body
    ) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(MessageBody.of(message, body));
    }

    public static <T> ResponseEntity<MessageBody<T>> status(
            HttpStatus status,
            String message,
            T body
    ) {
        return ResponseEntity.status(status)
                .body(MessageBody.of(message, body));
    }

    public static ResponseEntity<ExceptionCode> exception(ErrorCode errorCode) {
        return ResponseEntity.status(errorCode.getStatusCode())
                .body(ExceptionCode.from(errorCode));
    }
}
