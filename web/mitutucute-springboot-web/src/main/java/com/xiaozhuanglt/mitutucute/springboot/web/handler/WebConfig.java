package com.xiaozhuanglt.mitutucute.springboot.web.handler;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description: 拦截器配置
 * @author: hxz
 * @create: 2019-06-16 23:54
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer{

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
        //是否发送Cookie
        .allowCredentials(true)
        //放行哪些原始域
        .allowedOrigins("*")
        .allowedMethods(new String[]{"GET", "POST", "PUT", "DELETE"})
        .allowedHeaders("*")
        .exposedHeaders("Access-Control-Allow-Origin");
  }
}
