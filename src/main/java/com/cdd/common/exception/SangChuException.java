package com.cdd.common.exception;

import lombok.Getter;

@Getter
public class SangChuException extends RuntimeException {
    private final int statusCode;
    private final String errorCode;
    private final String message;

    public SangChuException(ErrorCode errorCode) {
        this.statusCode = errorCode.getStatusCode();
        this.errorCode = errorCode.getErrorCode();
        this.message = errorCode.getMessage();
    }
}
