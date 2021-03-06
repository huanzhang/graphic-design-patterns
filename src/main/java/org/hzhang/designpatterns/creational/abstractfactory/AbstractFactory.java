package org.hzhang.designpatterns.creational.abstractfactory;


/**
 * Created by Zhang Huan on 13/03/2018.
 */
public interface AbstractFactory {
    AbstractProductA createProductA();

    AbstractProductB createProductB();
}
