package com.xiaozhuanglt.mitutucute.springboot.web;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@ComponentScan(basePackages = {"com.xiaozhuanglt.mitutucute.springboot.service","com.xiaozhuanglt.mitutucute.springboot.controller"})
@MapperScan(basePackages = "com.xiaozhuanglt.mitutucute.springboot.dao")
@EnableDubbo
public class MitutucuteSpringbootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MitutucuteSpringbootWebApplication.class, args);
    }


}
