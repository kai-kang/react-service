package com.szjt.reactservice.dao;

import com.szjt.reactservice.domain.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoleMapper {

    List<Role> findRoleByUserId(@Param("userId") String userId);
}
