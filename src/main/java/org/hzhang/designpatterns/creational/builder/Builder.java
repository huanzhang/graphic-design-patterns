package org.hzhang.designpatterns.creational.builder;

/**
 * Created by Zhang Huan on 13/03/2018.
 */
public abstract class Builder {
    protected Product product;

    public Builder() {
        this.product = new Product();
    }

    abstract void buildPartA();

    abstract void buildPartB();

    abstract void buildPartC();

    protected Product getResult() {
        return product;
    }
}
