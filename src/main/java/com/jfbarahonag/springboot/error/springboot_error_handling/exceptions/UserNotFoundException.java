package com.jfbarahonag.springboot.error.springboot_error_handling.exceptions;

public class UserNotFoundException extends RuntimeException {
  public UserNotFoundException(String message) {
    super(message);
  }
}
