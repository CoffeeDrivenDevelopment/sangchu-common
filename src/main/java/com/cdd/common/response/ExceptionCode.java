package com.cdd.common.response;

import com.cdd.common.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonProperty;

public record ExceptionCode(
        @JsonProperty("message")
        String message,
        @JsonProperty("code")
        String code
) {
    public static ExceptionCode from(ErrorCode errorCode) {
        return new ExceptionCode(errorCode.getMessage(), errorCode.getErrorCode());
    }
}
