package org.hzhang.designpatterns.behavioral.state;

/**
 * Created by Zhang Huan on 16/03/2018.
 */
public class ConcreteStateA implements State {
    private static State instance;

    private ConcreteStateA() {
    }

    static State getInstance() {
        if (instance == null) {
            instance = new ConcreteStateA();
        }
        return instance;
    }

    @Override
    public void handle(Context context) {
        System.out.println("doing something in State A.\\n done,change state to B");
        context.changeState(ConcreteStateB.getInstance());

    }
}
