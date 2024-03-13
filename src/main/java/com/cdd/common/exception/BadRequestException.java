package com.cdd.common.exception;

/**
 * Http Status 400
 */
public class BadRequestException extends SangChuException {
    public BadRequestException(ErrorCode errorCode) {
        super(errorCode);
    }
}
