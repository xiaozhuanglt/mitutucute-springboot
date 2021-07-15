package com.xiaozhuanglt.mitutucute.springboot.dal.model.proxy;


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
    try {
      Students students = new Students();
      Person o = (Person) Proxy.newProxyInstance(students.getClass().getClassLoader(), Students.class.getInterfaces(), new JavaPracticeProxy(students));
      o.doSomething(110L);
    }catch (Exception e){
      e.printStackTrace();
    }
  }
}
