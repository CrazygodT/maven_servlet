package com.qf.service;

import com.qf.pojo.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(int uid);

    Boolean deleteById(int uid);

    Boolean update(User user);
}
