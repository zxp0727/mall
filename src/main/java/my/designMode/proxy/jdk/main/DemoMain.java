package my.designMode.proxy.jdk.main;

import my.designMode.proxy.jdk.DefaultDemo;
import my.designMode.proxy.jdk.handler.DefaultDemoHandler;
import my.designMode.proxy.jdk.impl.DefaultDemoImpl;

import java.lang.reflect.Proxy;


public class DemoMain {

    public static void main(String[] args) {
        DefaultDemo dd = new DefaultDemoImpl();
        DefaultDemo result = (DefaultDemo)Proxy.newProxyInstance(dd.getClass().getClassLoader(),
                new Class[]{DefaultDemo.class}, new DefaultDemoHandler(dd));
        result.sayHello();
    }
}
