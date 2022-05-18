package com.szjt.reactservice.dao;

import com.szjt.reactservice.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserMapper {
    List<User> findUserAll();
}
