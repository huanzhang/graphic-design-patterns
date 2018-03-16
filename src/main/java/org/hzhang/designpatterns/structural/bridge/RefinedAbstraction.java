package org.hzhang.designpatterns.structural.bridge;

/**
 * Created by Zhang Huan on 14/03/2018.
 */
public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("do something else ,and then ");
        implementor.operationImp();
    }
}
