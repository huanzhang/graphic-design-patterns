package org.hzhang.designpatterns.structural.facade;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class Facade {
    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public Facade() {
        systemA = new SystemA();
        systemB = new SystemB();
        systemC = new SystemC();
    }

    public void wrapOperation() {
        systemA.operationA();
        systemB.operationB();
        systemC.operationC();
    }
}
