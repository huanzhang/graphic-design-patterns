package org.hzhang.designpatterns.structural.decorator;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addBehavior();
    }

    private void addBehavior() {
        System.out.println("addBehavior AAAA");
    }
}
