package com.xiaozhuanglt.mitutucute.springboot.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
// 由于springboot 默认会加载datasource,导致本地数据库配置不成功，需要不能让其自动加载该类
@SpringBootApplication
@ComponentScan(basePackages = {"com.xiaozhuanglt.mitutucute.springboot.service","com.xiaozhuanglt.mitutucute.springboot.controller"})
@MapperScan(basePackages = "com.xiaozhuanglt.mitutucute.springboot.dao")
public class MitutucuteSpringbootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MitutucuteSpringbootWebApplication.class, args);
    }

}
