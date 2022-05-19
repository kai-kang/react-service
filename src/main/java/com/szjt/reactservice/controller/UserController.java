package com.szjt.reactservice.controller;

import com.szjt.reactservice.domain.User;
import com.szjt.reactservice.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RequestMapping("/user")
@Api(value = "API - UserController",description = "用户模块接口详情")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "测试user用户数据")
    @RequestMapping(value = "/findUserAll",method = RequestMethod.GET)
    public String findUserAll(){
        System.out.println("数据查询。。。。。。。。。");
        List<User> users = new ArrayList<>();
        users = userService.findUserAll();
        System.out.println("查询结束===========================");
        return users.get(0).toString();
    }
}
