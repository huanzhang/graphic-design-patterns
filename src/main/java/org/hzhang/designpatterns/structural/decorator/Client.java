package org.hzhang.designpatterns.structural.decorator;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class Client {
    public static void main(String[] args) {
        Decorator decoratorA = new ConcreteDecoratorA(new ConcreteComponent());
        decoratorA.operation();

        Decorator decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorB.operation();

        Robot robot = new Robot(new Car());
        robot.move();
        robot.say();
        Airplane airplane = new Airplane(new Car());
        airplane.move();
        airplane.fly();
    }
}
