package org.hzhang.designpatterns.structural.adapter;

/**
 * Created by Zhang Huan on 14/03/2018.
 */
public class Adapter2 extends Adaptee2 implements Target {
    public void request() {
        specificRequest();
    }
}
