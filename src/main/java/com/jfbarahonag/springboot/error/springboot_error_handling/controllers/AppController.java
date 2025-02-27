package com.jfbarahonag.springboot.error.springboot_error_handling.controllers;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfbarahonag.springboot.error.springboot_error_handling.models.domain.User;
import com.jfbarahonag.springboot.error.springboot_error_handling.services.UserService;

@RestController
@RequestMapping("/app")
public class AppController {

  private UserService userService;

  public AppController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/test")
  public String index() {
    // int val = 1/0;
    int val = Integer.parseInt("hola mundo");
    System.out.println(val);
    return "OK 200";
  }

  @GetMapping("users/{id}")
  public ResponseEntity<?> getUserById(@PathVariable Long id) {
    
    Optional<User> optional = userService.findById(id);

    if (optional.isEmpty()) {
      return ResponseEntity.notFound().build();
    }

    return ResponseEntity.ok().body(optional.orElseThrow());
  }
}
