/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.xiaozhuanglt.mitutucute.springboot.controller.aop.demo;

import org.springframework.stereotype.Service;

/**
 * @author hxz（Eason）
 * @version $Id: LandLord.java, v 0.1 2022-04-08 16:10 hxz（Eason） Exp $$
 */
@Service("landlord")
public class LandLord {

    public void service(){
        System.out.println("签合同");
        System.out.println("收房租");
    }
}
