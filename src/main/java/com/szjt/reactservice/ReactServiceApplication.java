package com.szjt.reactservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.szjt.reactservice.dao")
public class ReactServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReactServiceApplication.class, args);
    }

}
