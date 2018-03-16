package org.hzhang.designpatterns.structural.decorator;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addBehavior();
    }

    private void addBehavior() {
        System.out.println("addBehavior BBBB");
    }
}
