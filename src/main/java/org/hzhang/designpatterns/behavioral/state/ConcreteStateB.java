package org.hzhang.designpatterns.behavioral.state;

/**
 * Created by Zhang Huan on 16/03/2018.
 */
public class ConcreteStateB implements State {
    private static State instance;

    private ConcreteStateB() {
    }

    static State getInstance() {
        if (instance == null) {
            instance = new ConcreteStateB();
        }
        return instance;
    }

    @Override
    public void handle(Context context) {
        System.out.println("doing something in State B.\\n done,change state to A");
        context.changeState(ConcreteStateA.getInstance());

    }
}
