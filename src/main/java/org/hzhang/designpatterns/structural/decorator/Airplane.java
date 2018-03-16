package org.hzhang.designpatterns.structural.decorator;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class Airplane extends Changer {
    public Airplane(Transform transform) {
        super(transform);
    }

    @Override
    public void move() {
        System.out.println("Airplane can move");
    }

    public void fly() {
        System.out.println("Airplane can fly");
    }
}
