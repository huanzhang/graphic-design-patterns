package org.hzhang.designpatterns.behavioral.observer;

/**
 * Created by Zhang Huan on 16/03/2018.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observerA = new ConcreteObserver("A");
        Observer observerB = new ConcreteObserver("B");
        subject.attach(observerA);
        subject.attach(observerB);

        subject.setState(1);
        subject.notice();

        System.out.println("--------------------");

        subject.detach(observerB);
        subject.setState(2);
        subject.notice();
    }
}
