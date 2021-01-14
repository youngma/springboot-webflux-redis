package com.example.demo.common.config.excetpion.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DefaultErrorResponse {

    int code;
    int status;
    String message;
    String error;
}
