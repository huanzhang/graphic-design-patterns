package org.hzhang.designpatterns.structural.adapter;

/**
 * Created by Zhang Huan on 14/03/2018.
 */
public class Application {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();

        Target target2 = new Adapter2();
        target2.request();
    }
}
