package com.szjt.reactservice.service.impl;

import com.szjt.reactservice.dao.UserMapper;
import com.szjt.reactservice.domain.User;
import com.szjt.reactservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findUserAll() {
        List<User>  userList =userMapper.findUserAll();
        return userList;
    }

    @Override
    public User findByAccount(String account) {
        return userMapper.findByAccount(account);
    }
}
