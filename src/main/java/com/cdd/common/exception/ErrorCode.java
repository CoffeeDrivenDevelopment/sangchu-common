package com.cdd.common.exception;

public interface ErrorCode {
    int getStatusCode();

    String getErrorCode();

    String getMessage();
}
