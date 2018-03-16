package org.hzhang.designpatterns.structural.decorator;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class Car implements Transform {
    public void move() {
        System.out.println("Car can move");
    }
}
