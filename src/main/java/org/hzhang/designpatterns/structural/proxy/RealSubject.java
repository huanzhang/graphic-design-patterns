package org.hzhang.designpatterns.structural.proxy;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class RealSubject implements Subject {
    public void request() {
        System.out.println("RealSubject::request");
    }
}
