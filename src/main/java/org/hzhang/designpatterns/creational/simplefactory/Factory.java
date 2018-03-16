package org.hzhang.designpatterns.creational.simplefactory;

/**
 * Created by Zhang Huan on 13/03/2018.
 */
public class Factory {
    public static Product createProduct(String arg) {
        if (arg == "A") {
            return new ConcreteProductA();
        } else if (arg == "B") {
            return new ConcreteProductB();
        }
        return null;
    }
}

