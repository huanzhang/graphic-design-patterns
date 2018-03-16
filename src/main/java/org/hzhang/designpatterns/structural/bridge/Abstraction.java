package org.hzhang.designpatterns.structural.bridge;

/**
 * Created by Zhang Huan on 14/03/2018.
 */
public class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operationImp();
    }
}
