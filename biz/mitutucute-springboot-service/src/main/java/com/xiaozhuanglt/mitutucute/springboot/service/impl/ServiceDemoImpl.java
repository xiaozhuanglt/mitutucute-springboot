package com.xiaozhuanglt.mitutucute.springboot.service.impl;

import com.xiaozhuanglt.mitutucute.springboot.service.interfaces.ServiceDemo;
import com.xiaozhuanglt.mitutucute.springboot.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 框架测试
 * @author: hxz
 * @create: 2019-05-09 18:06
 **/
@Service("serviceDemo")
public class ServiceDemoImpl implements ServiceDemo {

    @Autowired
    DemoDao demoDao;

    /**
     * @param areaId
     * @return {@link int}
     * @author hxz
     * @date 2019/4/25 10:05
     * @Description: 查询地址信息
     * @Param: [areaId]
     */
    @Override
    public Long queryArea(Long areaId) {
        Long i = demoDao.selectAreaById(areaId);
        return i;
    }
}
