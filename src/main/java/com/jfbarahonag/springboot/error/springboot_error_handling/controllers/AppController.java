package com.jfbarahonag.springboot.error.springboot_error_handling.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
  
  @GetMapping("/app")
  public String index() {
    return "OK 200";
  }
}
