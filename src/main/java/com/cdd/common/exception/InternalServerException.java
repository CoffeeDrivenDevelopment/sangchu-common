package com.cdd.common.exception;

/**
 * Http Status 5xx
 */
public class InternalServerException extends SangChuException {
    public InternalServerException(ErrorCode errorCode) {
        super(errorCode);
    }
}
