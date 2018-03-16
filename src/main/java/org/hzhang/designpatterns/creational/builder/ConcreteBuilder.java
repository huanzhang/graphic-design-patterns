package org.hzhang.designpatterns.creational.builder;

/**
 * Created by Zhang Huan on 13/03/2018.
 */
public class ConcreteBuilder extends Builder {
    void buildPartA() {
        product.setA("A Style");
    }

    void buildPartB() {
        product.setB("B Style");
    }

    void buildPartC() {
        product.setC("C Style");
    }
}
