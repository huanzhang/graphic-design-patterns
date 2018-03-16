package org.hzhang.designpatterns.behavioral.observer;

/**
 * Created by Zhang Huan on 16/03/2018.
 */
public class ConcreteSubject extends Subject {
    private int state;

    @Override
    protected int getState() {
        return state;
    }

    @Override
    protected void setState(int state) {
        this.state = state;
    }
}
