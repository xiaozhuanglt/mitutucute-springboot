package com.xiaozhuanglt.mitutucute.springboot.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.xiaozhuanglt.mitutucute.springboot.service","com.xiaozhuanglt.mitutucute.springboot.controller"})
@MapperScan(basePackages = {"com.xiaozhuanglt.mitutucute.springboot.dao"})
public class MitutucuteSpringbootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MitutucuteSpringbootWebApplication.class, args);
    }

}
