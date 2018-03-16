package org.hzhang.designpatterns.structural.proxy;

import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();

        Subject subject = new RealSubject();
        Subject proxySubject = (Subject) java.lang.reflect.Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
                RealSubject.class.getInterfaces(), new DynamicInvocationHandler(subject));
        proxySubject.request();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Subject.class);
        enhancer.setCallback((net.sf.cglib.proxy.InvocationHandler) (o, method, objects) -> {
            System.out.println("before invoke");
            Object result = method.invoke(subject, objects);
            System.out.println("after invoke");
            return result;
        });
        Subject cglibProxySubject = (Subject)enhancer.create();
        cglibProxySubject.request();
    }
}

class DynamicInvocationHandler implements InvocationHandler {

    private Object obj;

    public DynamicInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke");
        Object result = method.invoke(obj, args);
        System.out.println("after invoke");
        return result;
    }
}
