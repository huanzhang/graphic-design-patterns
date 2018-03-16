package org.hzhang.designpatterns.behavioral.state;

/**
 * Created by Zhang Huan on 16/03/2018.
 */
public class Context {
    private State state;

    public Context() {
        this.state = ConcreteStateA.getInstance();
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}
