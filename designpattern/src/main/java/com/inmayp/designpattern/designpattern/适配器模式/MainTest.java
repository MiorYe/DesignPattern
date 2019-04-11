package com.inmayp.designpattern.designpattern.适配器模式;

public class MainTest {

    public static void main(String[] args) {
        Target target = new Adept();
        ((Adept) target).method1();
        target.method2();

    }

}
