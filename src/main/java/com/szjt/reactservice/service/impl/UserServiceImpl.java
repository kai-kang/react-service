package com.szjt.reactservice.service.impl;

import com.szjt.reactservice.dao.UserDao;
import com.szjt.reactservice.domain.User;
import com.szjt.reactservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findUserAll() {
        List<User>  userList =userDao.findUserAll();
        return userList;
    }
}
