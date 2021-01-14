package com.example.demo.common.config.excetpion;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.reactive.error.DefaultErrorAttributes;
import org.springframework.core.annotation.MergedAnnotation;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@Component
public class GlobalErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(ServerRequest request, ErrorAttributeOptions options) {
        Map<String, Object> map = super.getErrorAttributes(request, options);

        if (getError(request) instanceof GlobalException) {
            GlobalException ex = (GlobalException) getError(request);
            map.put("message", ex.getMessage());
            map.put("status", ex.getStatus().value());
            map.put("code", ex.getStatus().value());
            map.put("error", ex.getStatus().getReasonPhrase());
            return map;
        }

        return map;
    }
//    @Override
//    public Map<String, Object> getErrorAttributes(ServerRequest request, boolean includeStackTrace) {
//        Map<String, Object> map = super.getErrorAttributes(request, includeStackTrace);
//
//        if (getError(request) instanceof GlobalException) {
//            GlobalException ex = (GlobalException) getError(request);
//            map.put("exception", ex.getClass().getSimpleName());
//            map.put("message", ex.getMessage());
//            map.put("status", ex.getStatus().value());
//            map.put("error", ex.getStatus().getReasonPhrase());
//
//            return map;
//        }
//
//        map.put("exception", "SystemException");
//        map.put("message", "System Error , Check logs!");
//        map.put("status", "500");
//        map.put("error", " System Error ");
//        return map;
//    }
}
