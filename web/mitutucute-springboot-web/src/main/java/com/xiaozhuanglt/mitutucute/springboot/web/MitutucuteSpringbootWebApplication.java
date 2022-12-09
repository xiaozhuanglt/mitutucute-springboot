package com.xiaozhuanglt.mitutucute.springboot.web;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan(basePackages = {"com.xiaozhuanglt.mitutucute.springboot.service","com.xiaozhuanglt.mitutucute.springboot.controller"})
@MapperScan(basePackages = "com.xiaozhuanglt.mitutucute.springboot.dao")
@EnableDubbo(scanBasePackages = {"com.xiaozhuanglt.mitutucute.springboot"})
public class MitutucuteSpringbootWebApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(MitutucuteSpringbootWebApplication.class, args);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


}
