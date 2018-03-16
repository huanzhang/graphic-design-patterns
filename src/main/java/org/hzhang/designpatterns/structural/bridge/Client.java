package org.hzhang.designpatterns.structural.bridge;

/**
 * Created by Zhang Huan on 14/03/2018.
 */
public class Client {
    public static void main(String[] args) {
        Implementor implementorA = new ConcreteImplementorA();
        Abstraction pa = new RefinedAbstraction(implementorA);
        pa.operation();

        Abstraction pb = new RefinedAbstraction(new ConcreteImplementorB());
        pb.operation();
    }
}
