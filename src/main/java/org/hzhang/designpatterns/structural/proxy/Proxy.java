package org.hzhang.designpatterns.structural.proxy;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class Proxy implements Subject {
    private Subject subject = new RealSubject();

    public void request() {
        preRequest();
        subject.request();
        afterRequest();
    }

    private void preRequest() {
        System.out.println("Proxy::preRequest");
    }

    private void afterRequest() {
        System.out.println("Proxy::afterRequest");
    }
}
