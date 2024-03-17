package com.cdd.common.response;

import com.cdd.common.exception.CallConstructorException;
import com.cdd.common.exception.ErrorCode;
import com.cdd.common.exception.SangChuException;
import org.springframework.http.ResponseEntity;

public class ResponseEntityExceptionFactory {

    private ResponseEntityExceptionFactory() {
        throw new CallConstructorException();
    }

    public static ResponseEntity<ExceptionCode> exception(ErrorCode errorCode) {
        return ResponseEntity.status(errorCode.getStatusCode())
                .body(ExceptionCode.from(errorCode));
    }

    public static ResponseEntity<ExceptionCode> exception(SangChuException e) {
        return ResponseEntity.status(e.getStatusCode())
                .body(ExceptionCode.from(e));
    }
}
