package com.example.demo.common.config.excetpion;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class NotFoundApiException extends ResponseStatusException {
    public NotFoundApiException() {
        super(HttpStatus.NOT_FOUND);
    }
}
