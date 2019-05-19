package com.xiaozhuanglt.mitutucute.springboot.service.impl;

import com.xiaozhuanglt.mitutucue.facade.DemoFacade;
import com.xiaozhuanglt.mitutucute.springboot.service.interfaces.ServiceDemo;
import com.xiaozhuanglt.mitutucute.springboot.dao.DemoDao;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description: 框架测试
 * @author: hxz
 * @create: 2019-05-09 18:06
 **/
@Service("serviceDemo")
public class ServiceDemoImpl implements ServiceDemo {

    @Autowired
    DemoDao demoDao;
    @Reference
    DemoFacade demoFacade;

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

    /**
     * @param areaId
     * @return {@link Long}
     * @author hxz
     * @date 2019/5/17 18:00
     * @Description: Dubbo框架测试
     * @Param: [areaId]
     */
    @Override
    @GetMapping("/queryMitutucueArea")
    public int queryMitutucueArea(Long areaId) {
        int i = 0;
        i = demoFacade.queryArea(areaId);
        return i;
    }
}
