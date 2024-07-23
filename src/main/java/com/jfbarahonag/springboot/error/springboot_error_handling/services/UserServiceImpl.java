package com.jfbarahonag.springboot.error.springboot_error_handling.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfbarahonag.springboot.error.springboot_error_handling.models.domain.User;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private List<User> users;

  public UserServiceImpl() {}

  @Override
  public List<User> findAll() {
    return users;
  }

  @Override
  public Optional<User> findById(long id) {
    return users.stream()
        .filter(u -> u.getId().equals(id))
        .findFirst();
  }

}
