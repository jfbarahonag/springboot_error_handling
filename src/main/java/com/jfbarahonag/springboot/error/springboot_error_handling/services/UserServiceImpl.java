package com.jfbarahonag.springboot.error.springboot_error_handling.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jfbarahonag.springboot.error.springboot_error_handling.models.domain.User;

@Service
public class UserServiceImpl implements UserService {

  private List<User> users;

  public UserServiceImpl() {
    users = Arrays.asList(
      new User(1L, "Pepe", "Piolas"),
      new User(2L, "Martin", "Polar"),
      new User(3L, "Candida", "Heredia")
    );
  }

  @Override
  public List<User> findAll() {
    return users;
  }

  @Override
  public User findById(long id) {
    return users.stream()
        .filter(u -> u.getId().equals(id))
        .findFirst()
        .orElseThrow(null);
  }

}
