package com.example.demo.common.config.excetpion;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GlobalException extends ResponseStatusException {

    private final int code;

    public GlobalException(int code) {
        super(HttpStatus.INTERNAL_SERVER_ERROR);
        this.code = code;
    }

    public GlobalException(int code, String message) {
        super(HttpStatus.INTERNAL_SERVER_ERROR, message);
        this.code = code;
    }

    public GlobalException(int code, String message, Throwable e) {
        super(HttpStatus.INTERNAL_SERVER_ERROR, message, e);
        this.code = code;
    }
}
