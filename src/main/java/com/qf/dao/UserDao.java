package com.qf.dao;

import com.qf.pojo.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

    User findById(int uid);

    Boolean deleteById(int uid);

    Boolean update(User user);
}
