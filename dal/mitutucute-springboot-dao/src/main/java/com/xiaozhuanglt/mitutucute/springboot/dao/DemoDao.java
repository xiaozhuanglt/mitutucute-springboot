package com.xiaozhuanglt.mitutucute.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @description: 框架测试
 * @author: hxz
 * @create: 2019-05-09 21:25
 **/
@Component
public interface DemoDao {

    Long selectAreaById(@Param("areaId")Long areaId);
}
