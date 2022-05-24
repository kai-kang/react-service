package com.szjt.reactservice.controller;

import com.szjt.reactservice.utils.ServerResponseEnum;
import com.szjt.reactservice.utils.ServerResponseVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "API - LoginController",description = "测试shiro功能")
@RequestMapping("")
public class LoginController {
    @ApiOperation(value = "测试user登录")
    @PostMapping("/login")
    public ServerResponseVO login(@RequestParam(value = "account") String account,
                                  @RequestParam(value = "password") String password) {
        System.out.println("************************************************************");
        Subject userSubject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(account, password);
        try {
            // 登录验证
            userSubject.login(token);
            System.out.println(token.toString());
            return ServerResponseVO.success();
        } catch (UnknownAccountException e) {
            return ServerResponseVO.error(ServerResponseEnum.ACCOUNT_NOT_EXIST);
        } catch (DisabledAccountException e) {
            return ServerResponseVO.error(ServerResponseEnum.ACCOUNT_IS_DISABLED);
        } catch (IncorrectCredentialsException e) {
            return ServerResponseVO.error(ServerResponseEnum.INCORRECT_CREDENTIALS);
        } catch (Throwable e) {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            e.printStackTrace();
            return ServerResponseVO.error(ServerResponseEnum.ERROR);
        }
    }

    @GetMapping("/login")
    public ServerResponseVO login() {
        return ServerResponseVO.error(ServerResponseEnum.NOT_LOGIN_IN);
    }

    @GetMapping("/auth")
    public String auth() {
        return"已成功登录";
    }

    @GetMapping("/role")
    @RequiresRoles("vip")
    public String role() {
        return"测试Vip角色";
    }

    @GetMapping("/permission")
    @RequiresPermissions(value = {"add", "update"}, logical = Logical.AND)
    public String permission() {
        return"测试Add和Update权限";
    }
}
