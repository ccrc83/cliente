package com.ccrc.cliente.exception;


import com.ccrc.cliente.application.exception.ErrorException;
import com.ccrc.cliente.exception.responses.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ErrorException.class)
    public  ResponseEntity<Map<String, Object>> exception(ErrorException errorException){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse(errorException.getMessage()).toJson());
    }
}
