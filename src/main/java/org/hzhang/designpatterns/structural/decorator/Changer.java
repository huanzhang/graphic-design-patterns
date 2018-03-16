package org.hzhang.designpatterns.structural.decorator;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public abstract class Changer implements Transform {
    private Transform transform;

    public Changer(Transform transform) {
        this.transform = transform;
    }

    public void move() {
        transform.move();
    }
}
