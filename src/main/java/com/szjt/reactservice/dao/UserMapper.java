package com.szjt.reactservice.dao;

import com.szjt.reactservice.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserMapper {
    List<User> findUserAll();

    User findByAccount(@Param("account") String account);
}
