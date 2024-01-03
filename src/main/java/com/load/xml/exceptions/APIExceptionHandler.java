package com.load.xml.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class APIExceptionHandler {

    @ExceptionHandler({
            NullPointerException.class
    })
    public ResponseEntity<String> nullPointerExceptionError(NullPointerException exception){
        return ResponseEntity.noContent().build();
    }
}
