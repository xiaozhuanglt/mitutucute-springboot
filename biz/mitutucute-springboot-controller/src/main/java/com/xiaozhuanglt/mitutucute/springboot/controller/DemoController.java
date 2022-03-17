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
    public Long queryArea(Long areaId){
        try {
            Long i = serviceDemo.queryArea(areaId);
            return i;
        }catch (Exception e){
            System.out.println(e);
            return Long.valueOf(-1);
        }
    }

    @GetMapping("consumerDemo")
    public int queryMitutucueArea(){
        try {
            int i = serviceDemo.queryMitutucueArea(Long.valueOf(5));
            return i;
        }catch (Exception e){
            System.out.println(e);
            return -1;
        }
    }

}
