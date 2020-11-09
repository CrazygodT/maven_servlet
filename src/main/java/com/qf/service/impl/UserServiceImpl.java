package com.qf.service.impl;

import com.qf.dao.UserDao;
import com.qf.dao.impl.UserDaoImpl;
import com.qf.pojo.User;
import com.qf.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(int uid) {
        return userDao.findById(uid);
    }

    @Override
    public Boolean deleteById(int uid) {
        return userDao.deleteById(uid);
    }

    @Override
    public Boolean update(User user) {
        return userDao.update(user);
    }
}
