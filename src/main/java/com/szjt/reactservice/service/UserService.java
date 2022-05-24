package com.szjt.reactservice.service;

import com.szjt.reactservice.domain.User;

import java.util.List;

public interface UserService {

    List<User> findUserAll();

    User findByAccount(String account);
}
