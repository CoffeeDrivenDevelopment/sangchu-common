package com.cdd.common.exception;

public enum ServerErrorCode implements ErrorCode {
    BAD_REQUEST(400, "SERVER_001", "잘못된 요청입니다."),
    INTERNAL_SERVER_ERROR(500, "SERVER_002", "내부 서버 오류입니다.");

    private final int statusCode;
    private final String errorCode;
    private final String message;

    ServerErrorCode(int statusCode, String errorCode, String message) {
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.message = message;
    }

    @Override
    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
