package my.designMode.proxy.jdk.handler;

import my.designMode.proxy.jdk.DefaultDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DefaultDemoHandler implements InvocationHandler {

    private DefaultDemo defaultDemo;

    public DefaultDemoHandler(DefaultDemo defaultDemo) {
        this.defaultDemo = defaultDemo;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start....");
        Object invoke = method.invoke(defaultDemo, args);
        System.out.println("end...");
        return invoke;
    }
}
