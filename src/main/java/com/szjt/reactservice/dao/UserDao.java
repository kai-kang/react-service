package com.szjt.reactservice.dao;

import com.szjt.reactservice.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface UserDao {
    List<User> findUserAll();
}
