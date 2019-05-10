package com.xiaozhuanglt.mitutucute.springboot.controller;

import com.xiaozhuanglt.mitutucute.springboot.service.interfaces.ServiceDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 高德地址测试
 * @author: hxz
 * @create: 2019-05-09 15:44
 **/
@RestController
public class AmapServiceController {

    @Autowired
    ServiceDemo serviceDemo;

    /**
     * @author hxz
     * @date  2019/4/25 11:02
     * @Description:
     * @Param: [areaId]
     * @return {@link int}
     */
    public int queryArea(Long areaId){

        int i = serviceDemo.queryArea(areaId);
        return i;
    }

}
