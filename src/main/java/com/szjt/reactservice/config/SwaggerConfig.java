package com.szjt.reactservice.config;

import com.google.common.base.Predicates;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
    //public static final Contact CONTACT = new Contact("", "https://blog.csdn.net/ILOVEMYDEAR", "1010501187@qq.com");
    //注入配置文件中的项目名称
    //@Value("${server.servlet.context-path}")
    //private String contextPath;

    @Bean
    public Docket docket() {
        // 设置要显示swagger的环境
        // 通过 enable() 接收此参数判断是否要显示
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
        // .enable(false)   // 配置是否启用Swagger，如果是false，在浏览器将无法访问
        .select()   // 通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
        //.apis(RequestHandlerSelectors.basePackage("com.szjt.reactservice"))   //配置你想在那个controller层生产接口文档
        //.paths(PathSelectors.ant("/search/**"))   // 配置如何通过path过滤,即这里只扫描请求以/kuang开头的接口
        //不显示错误的接口地址
        .paths(Predicates.not(PathSelectors.regex("/error.*")))//错误路径不监控
        .build();
    }
    //配置文档信息
    private ApiInfo apiInfo() {
        Contact CONTACT = new Contact("kangk", "https:/123456789", "1010501187@qq.com");
        return new ApiInfo(
                "User",// 标题
                "用户模块测试API",// 描述
                "v1.0",// 版本
                "https://blog.csdn.net/ILOVEMYDEAR",// 组织链接
                CONTACT,// 联系人信息
                "Apach 2.0 许可",// 许可
                "许可链接",// 许可连接
                new ArrayList<>()// 扩展
                );    }

}
