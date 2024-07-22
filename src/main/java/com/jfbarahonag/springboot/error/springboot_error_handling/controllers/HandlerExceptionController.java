package com.jfbarahonag.springboot.error.springboot_error_handling.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import com.jfbarahonag.springboot.error.springboot_error_handling.models.Error;

@RestControllerAdvice
public class HandlerExceptionController {

  @ExceptionHandler({ ArithmeticException.class })
  public ResponseEntity<Error> handler(Exception ex) {

    Error err = new Error();
    err.setDate(new Date());
    err.setMessage("Arithemtic error: " + ex.getMessage());
    err.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());

    // return ResponseEntity.internalServerError().body(err);
    return ResponseEntity
        .status(err.getStatusCode())
        .body(err);
  }

  @ExceptionHandler(NoResourceFoundException.class)
  public ResponseEntity<Error> notFoundHandler(Exception ex) {

    Error err = new Error();
    err.setDate(new Date());
    err.setMessage("Not found: " + ex.getMessage());
    err.setStatusCode(404);

    return ResponseEntity.status(err.getStatusCode()).body(err);
  }
}
