package com.jfbarahonag.springboot.error.springboot_error_handling.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
  
  @GetMapping("/app")
  public String index() {
    // int val = 1/0;
    int val = Integer.parseInt("hola mundo");
    System.out.println(val);
    return "OK 200";
  }
}
