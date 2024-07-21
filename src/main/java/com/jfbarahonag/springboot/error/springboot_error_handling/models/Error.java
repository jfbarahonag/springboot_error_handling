package com.jfbarahonag.springboot.error.springboot_error_handling.models;

import java.util.Date;

public class Error {
  
  private int statusCode;
  
  private String message;
  
  private Date date;
  
  public int getStatusCode() {
    return statusCode;
  }
  
  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
