package org.hzhang.designpatterns.structural.adapter;

/**
 * Created by Zhang Huan on 14/03/2018.
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}
