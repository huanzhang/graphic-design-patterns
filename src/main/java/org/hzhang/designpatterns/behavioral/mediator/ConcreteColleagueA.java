package org.hzhang.designpatterns.behavioral.mediator;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class ConcreteColleagueA extends Colleague {
    @Override
    public void receivemsg(String str) {
        System.out.println("ConcreteColleagueA reveivemsg:" + str);
    }

    @Override
    public void sendmsg(int toWho, String str) {
        System.out.println("send msg from colleagueA,to:" + toWho);
        mediator.operation(toWho, str);
    }
}
