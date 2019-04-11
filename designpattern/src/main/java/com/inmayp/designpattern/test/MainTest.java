package com.inmayp.designpattern.test;

import com.inmayp.designpattern.代理模式.Proxy;
import com.inmayp.designpattern.代理模式.Sourceable;

public class MainTest {

    public static void main(String[] args) {
//        Target target = new Adept();
//        ((Adept) target).method1();
//        target.method2();

        Proxy source = new Proxy();
        source.method();

    }




}
