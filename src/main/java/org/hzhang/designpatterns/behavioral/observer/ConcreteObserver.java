package org.hzhang.designpatterns.behavioral.observer;

/**
 * Created by Zhang Huan on 16/03/2018.
 */
public class ConcreteObserver implements Observer {
    private int observerState;
    private String observerName;

    public ConcreteObserver(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(Subject subject) {
        observerState = subject.getState();
        System.out.println("update oberserver[" + observerName + "] state:" + observerState);
    }
}
