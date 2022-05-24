package com.szjt.reactservice.service.impl;

import com.szjt.reactservice.dao.RoleMapper;
import com.szjt.reactservice.domain.Role;
import com.szjt.reactservice.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> findRoleByUserId(String id) {
        return roleMapper.findRoleByUserId(id);
    }
}
