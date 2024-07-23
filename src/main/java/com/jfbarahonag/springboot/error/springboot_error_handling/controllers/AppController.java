package com.jfbarahonag.springboot.error.springboot_error_handling.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfbarahonag.springboot.error.springboot_error_handling.models.domain.User;
import com.jfbarahonag.springboot.error.springboot_error_handling.services.UserService;

@RestController
@RequestMapping("/app")
public class AppController {

  @Autowired
  private UserService userService;
  
  @GetMapping("/test")
  public String index() {
    // int val = 1/0;
    int val = Integer.parseInt("hola mundo");
    System.out.println(val);
    return "OK 200";
  }

  @GetMapping("users/{id}")
  public User getUserById(@PathVariable Long id) {
    return userService.findById(id);
  }
}
