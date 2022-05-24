package com.szjt.reactservice.service;

import java.util.List;

public interface PermissionService {

    public List<String> findByRoleId(List<String> roleIds);
}
