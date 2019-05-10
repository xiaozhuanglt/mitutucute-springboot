package com.xiaozhuanglt.mitutucute.springboot.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @description: 框架测试
 * @author: hxz
 * @create: 2019-05-09 21:25
 **/
public interface DemoDao {

    int selectAreaById(@Param("areaId")Long areaId);
}
