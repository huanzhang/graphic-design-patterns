package org.hzhang.designpatterns.behavioral.mediator;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class ConcreteColleagueB extends Colleague {
    @Override
    public void receivemsg(String str) {
        System.out.println("ConcreteColleagueB reveivemsg:" + str);
    }

    @Override
    public void sendmsg(int toWho, String str) {
        System.out.println("send msg from colleagueB,to:" + toWho);
        mediator.operation(toWho, str);
    }
}
