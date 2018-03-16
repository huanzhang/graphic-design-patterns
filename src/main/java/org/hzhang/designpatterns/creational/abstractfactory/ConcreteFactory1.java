package org.hzhang.designpatterns.creational.abstractfactory;

/**
 * Created by Zhang Huan on 13/03/2018.
 */
public class ConcreteFactory1 implements AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
