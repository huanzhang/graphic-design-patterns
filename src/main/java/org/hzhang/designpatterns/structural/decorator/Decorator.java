package org.hzhang.designpatterns.structural.decorator;

/**
 * Created by Zhang Huan on 14/03/2018.
 */
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}
