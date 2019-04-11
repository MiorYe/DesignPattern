package com.inmayp.designpattern.designpattern.适配器模式;

/**
 * 适配器类
 */
public class Adept extends Source implements Target {

    @Override
    public void method2() {
        System.out.println("this is a target method ......");
    }
}
