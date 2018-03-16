package org.hzhang.designpatterns.behavioral.mediator;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public abstract class Colleague {
    protected Mediator mediator;

    void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void receivemsg(String str);

    abstract void sendmsg(int toWho, String str);

}
