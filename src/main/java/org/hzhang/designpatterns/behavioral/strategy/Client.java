package org.hzhang.designpatterns.behavioral.strategy;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        Strategy s1 = new ConcreteStrategyA();
        context.setStrategy(s1);
        context.algorithm();

        Strategy s2 = new ConcreteStrategyB();
        context.setStrategy(s2);
        context.algorithm();
    }
}
