package com.cdd.common.exception;

public class SangChuException extends RuntimeException {
    private final int statusCode;
    private final String errorCode;
    private final String message;

    public SangChuException(ErrorCode errorCode) {
        this.statusCode = errorCode.getStatusCode();
        this.errorCode = errorCode.getErrorCode();
        this.message = errorCode.getMessage();
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
