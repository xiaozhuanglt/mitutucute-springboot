package com.xiaozhuanglt.mitutucute.springboot.service.interfaces;

public interface ServiceDemo {

    /**
     * @author hxz
     * @date  2019/4/25 10:05
     * @Description: 查询地址信息
     * @Param: [areaId]
     * @return {@link int}
     */
    Long queryArea(Long areaId);

    /**
     * @author hxz
     * @date  2019/5/17 18:00
     * @Description: Dubbo框架测试
     * @Param: [areaId]
     * @return {@link Long}
     */
    int queryMitutucueArea(Long areaId);
}
