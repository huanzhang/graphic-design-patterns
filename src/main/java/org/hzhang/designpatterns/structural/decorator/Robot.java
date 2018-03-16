package org.hzhang.designpatterns.structural.decorator;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class Robot extends Changer {
    public Robot(Transform transform) {
        super(transform);
    }

    @Override
    public void move() {
        System.out.println("Robot can move");
    }

    public void say() {
        System.out.println("Robot can say");
    }
}
