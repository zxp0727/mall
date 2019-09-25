package my.designMode.proxy.jdk.impl;

import my.designMode.proxy.jdk.DefaultDemo;

public class DefaultDemoImpl implements DefaultDemo {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
