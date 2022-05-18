package com.szjt.reactservice.controller;

import com.szjt.reactservice.domain.User;
import com.szjt.reactservice.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RequestMapping("/user")
@Api(value = "desc of class")
@RestController
public class UserController {

    @Autowired
    UserService userService;
    /* 方法注解 */
    /*@ApiOperation(value = "desc of method", notes = "")
    @GetMapping(value="/hello")
    public Object hello( *//* 参数注解 *//* @ApiParam(value = "desc of param" , required=true ) @RequestParam String name) {
        return "Hello " + name + "!";
    }*/
    @ApiOperation(value = "findUserAll")
    //@RequestMapping("/findUserAll")
    @GetMapping("findUserAll")
    public String findUserAll(){
        List<User> users = new ArrayList<>();
        users = userService.findUserAll();
        return users.get(1).toString();
    }
}
