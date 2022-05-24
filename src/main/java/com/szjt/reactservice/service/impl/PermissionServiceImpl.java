package com.szjt.reactservice.service.impl;

import com.szjt.reactservice.dao.PermissionMapper;
import com.szjt.reactservice.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<String> findByRoleId(List<String> roleIds) {
        return permissionMapper.findByRoleId(roleIds);
    }
}
