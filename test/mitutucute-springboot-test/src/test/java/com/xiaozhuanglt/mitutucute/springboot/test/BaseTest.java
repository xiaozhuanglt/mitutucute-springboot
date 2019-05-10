package com.xiaozhuanglt.mitutucute.springboot.test;

import javafx.application.Application;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @description: 基础测试类
 * @author: hxz
 * @create: 2019-05-09 22:19
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
@TestPropertySource("classpath:application.yml")
@ComponentScan(basePackages = {"com.xiaozhuanglt.mitutucute.springboot.service","com.xiaozhuanglt.mitutucute.springboot.controller"})
public class BaseTest {

    @Before
    public void init(){
        System.out.println("开始测试-------------------------------------------");
    }
    @After
    public void after(){
        System.out.println("测试结束-------------------------------------------");
    }
}
