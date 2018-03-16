package org.hzhang.designpatterns.creational.factorymethod;

/**
 * Created by Zhang Huan on 13/03/2018.
 */
public class ConcreteFactory implements Factory {
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
