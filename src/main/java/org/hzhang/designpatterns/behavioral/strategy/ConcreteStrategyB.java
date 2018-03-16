package org.hzhang.designpatterns.behavioral.strategy;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("use algorithm B");
    }
}
