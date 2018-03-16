package org.hzhang.designpatterns.behavioral.strategy;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        strategy.algorithm();
    }
}
