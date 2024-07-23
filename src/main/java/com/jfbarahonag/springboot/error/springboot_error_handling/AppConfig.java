package com.jfbarahonag.springboot.error.springboot_error_handling;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jfbarahonag.springboot.error.springboot_error_handling.models.domain.User;

@Configuration
public class AppConfig {

  @Bean
  List<User> users() {
    return Arrays.asList(
      new User(1L, "Pepe", "Piolas"),
      new User(2L, "Martin", "Polar"),
      new User(3L, "Candida", "Erendira"),
      new User(4L, "Francisco", "El matematico")
    );
  }

}
