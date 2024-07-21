package com.jfbarahonag.springboot.error.springboot_error_handling.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class HandlerExceptionController {
  
  @ExceptionHandler({ArithmeticException.class})
  public ResponseEntity<?> handler(Exception ex) {
    return ResponseEntity.internalServerError().body("error 500");
  }
}
