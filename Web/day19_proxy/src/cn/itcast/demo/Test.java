package cn.itcast.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        DemoFace f1 = new Demo();
        String str = f1.getParameter("aaa");
        DemoFace f2 = (DemoFace) Proxy.newProxyInstance(f1.getClass().getClassLoader(), f1.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                args[0]+="2222";
                Object invoke = method.invoke(f1, args);
                return invoke;
            }
        });
        String st1 = f2.getParameter("aaa");
        System.out.println(st1);
    }
}
