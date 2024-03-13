package com.cdd.common.response;

import com.cdd.common.exception.CallConstructorException;
import com.cdd.common.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ExceptionCode {
    @JsonProperty("message")
    private String message;
    @JsonProperty("code")
    private String code;

    private ExceptionCode() {
        throw new CallConstructorException();
    }

    private ExceptionCode(
            String message,
            String code) {
        this.message = message;
        this.code = code;
    }

    public static ExceptionCode from(ErrorCode errorCode) {
        return new ExceptionCode(errorCode.getMessage(), errorCode.getErrorCode());
    }
}
