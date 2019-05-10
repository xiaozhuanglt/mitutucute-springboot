package com.xiaozhuanglt.mitutucute.springboot.test;

import com.xiaozhuanglt.mitutucute.springboot.controller.AmapServiceController;
import com.xiaozhuanglt.mitutucute.springboot.service.interfaces.ServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description: 测试类框架测试
 * @author: hxz
 * @create: 2019-05-10 10:56
 **/
public class TestDemo extends BaseTest {

    @Autowired
    AmapServiceController amapServiceController;
    @Autowired
    ServiceDemo serviceDemo;



}
