package com.xiaozhuanglt.mitutucute.springboot.controller.demo;

public class OutAndInnerClass {

    public static void main(String[] args) {
        OutAndInnerClass outAndInnerClass = new OutAndInnerClass();
        Innerclass innerclass = outAndInnerClass.new Innerclass();
        String s = innerclass.returnInner("厉害了吧：");
        System.out.println(s);
    }

    class Innerclass{
        public String returnInner(String s){
            return "Innerclass 返回了传入的值：" + s;
        }
    }
}
