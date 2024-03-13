package com.cdd.common.exception;

public class CallConstructorException extends RuntimeException {
    public CallConstructorException() {
        super("Don't Call Me");
    }
}
