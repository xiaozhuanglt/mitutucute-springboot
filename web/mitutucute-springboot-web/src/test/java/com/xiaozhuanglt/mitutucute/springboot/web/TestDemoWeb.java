package com.xiaozhuanglt.mitutucute.springboot.web;

import com.xiaozhuanglt.mitutucute.springboot.controller.AmapServiceController;
import com.xiaozhuanglt.mitutucute.springboot.service.interfaces.ServiceDemo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description: 测试类框架测试
 * @author: hxz
 * @create: 2019-05-10 10:56
 **/
public class TestDemoWeb extends WebBaseTest {

    @Autowired
    AmapServiceController amapServiceController;
    @Autowired
    ServiceDemo serviceDemo;

    @Test
    public void test1(){
        try {
            Long areaId = Long.valueOf(4);
            int i = serviceDemo.queryArea(areaId);
            System.out.println(i);
        }catch (Exception e){
            System.out.println(e);
        }
    }



}
