package com.xiaozhuanglt.mitutucute.springboot.controller;

import com.xiaozhuanglt.mitutucute.springboot.service.interfaces.ServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: springboot框架测试
 * @author: hxz
 * @create: 2019-05-10 15:02
 **/

@RestController
@RequestMapping("/demoController")
public class DemoController {

    @Autowired
    ServiceDemo serviceDemo;

    @GetMapping("/queryArea")
    public int queryArea(Long areaId){
        try {
            int i = serviceDemo.queryArea(areaId);
            return i;
        }catch (Exception e){
            System.out.println(e);
            return -1;
        }
    }

}
