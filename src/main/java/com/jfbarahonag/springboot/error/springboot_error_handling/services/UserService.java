package com.jfbarahonag.springboot.error.springboot_error_handling.services;

import java.util.List;

import com.jfbarahonag.springboot.error.springboot_error_handling.models.domain.User;

public interface UserService {

  List<User> findAll();
  User findById(long id);
}
