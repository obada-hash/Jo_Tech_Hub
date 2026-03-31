package berserk.jo_tech_hub.controller;

import berserk.jo_tech_hub.error.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(final RuntimeException e) {
        String message = e.getMessage();
        message+= "fuck you don't know what you are doing!";
        return new ResponseEntity<>(message, HttpStatus.CONFLICT);
    }
}
