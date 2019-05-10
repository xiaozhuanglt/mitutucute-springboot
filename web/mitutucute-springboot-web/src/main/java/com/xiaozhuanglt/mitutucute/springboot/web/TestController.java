package com.xiaozhuanglt.mitutucute.springboot.web;

import com.xiaozhuanglt.mitutucute.springboot.controller.AmapServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

/**
 * @description: springboot 启动测试
 * @author: hxz
 * @create: 2019-05-06 17:20
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    AmapServiceController amapServiceController;

    /**
     * 测试获取时间
     */
    @GetMapping("/getdate")
    public String getDate() {
        Long d = System.currentTimeMillis();
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d);
        return "当前时间：" + format;
    }
}
