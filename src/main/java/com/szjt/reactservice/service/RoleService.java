package com.szjt.reactservice.service;

import com.szjt.reactservice.domain.Role;

import java.util.List;

public interface RoleService {

    public List<Role> findRoleByUserId(String id);
}
