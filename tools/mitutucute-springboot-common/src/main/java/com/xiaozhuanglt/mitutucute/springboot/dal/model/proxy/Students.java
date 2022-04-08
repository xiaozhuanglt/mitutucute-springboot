package com.xiaozhuanglt.mitutucute.springboot.dal.model.proxy;


import util.MonitorUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: students
 * @author: hxz
 * @create: 2021-07-09 15:45
 **/
public class Students implements Person {

  @Override
  public void doSomething(Long num) {
    System.out.printf("交元学费" + num + "元\n");
  }

  public static void main(String[] args) {
      Students target = new Students();
      /*try {
      Person o = (Person) Proxy.newProxyInstance(target.getClass().getClassLoader(), Students.class.getInterfaces(), new JavaPracticeProxy(target));
      o.doSomething(110L);
    }catch (Exception e){
      e.printStackTrace();
    }*/

    //方式二：
      Person o = (Person) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
          @Override
          public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
              System.out.printf("开始代理\n");
              MonitorUtil.start();
              Object invoke = method.invoke(target, args);
              MonitorUtil.finish(method.getName());
              System.out.printf("结束代理\n");
              return invoke;
          }
      });
      o.doSomething(1233l);
  }
}
