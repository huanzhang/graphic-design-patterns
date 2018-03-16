package org.hzhang.designpatterns.structural.facade;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.wrapOperation();
    }
}
