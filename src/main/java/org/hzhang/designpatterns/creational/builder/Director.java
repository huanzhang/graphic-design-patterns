package org.hzhang.designpatterns.creational.builder;

/**
 * Created by Zhang Huan on 13/03/2018.
 */
public class Director {
    private Builder builder;

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
