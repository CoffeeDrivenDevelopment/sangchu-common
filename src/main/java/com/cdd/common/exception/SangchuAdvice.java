package com.cdd.common.exception;

import com.cdd.common.response.ExceptionCode;
import com.cdd.common.response.ResponseEntityExceptionFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class SangchuAdvice {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionCode> internalServerHandleException(Exception e) {
        log.error("""

                        Exception Message  : {},
                        Exception Trace    : {},
                        """,
                e.getMessage(),
                e.getStackTrace()[0]);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ExceptionCode.from(ServerErrorCode.INTERNAL_SERVER_ERROR));
    }

    @ExceptionHandler(SangChuException.class)
    public ResponseEntity<ExceptionCode> handleException(SangChuException e) {
        return ResponseEntityExceptionFactory.exception(e);
    }
}
