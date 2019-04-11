package com.inmayp.designpattern.代理模式;

/**
 * 接口实现类
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("接口实现类");
    }
}
