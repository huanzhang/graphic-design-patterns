package org.hzhang.designpatterns.behavioral.mediator;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class Client {
    public static void main(String[] args) {
        Colleague colleagueA = new ConcreteColleagueA();
        Colleague colleagueB = new ConcreteColleagueB();

        Mediator mediator = new ConcreteMediator();
        mediator.register(1, colleagueA);
        mediator.register(2, colleagueB);

        colleagueA.sendmsg(2, "hello,i am a");
        colleagueB.sendmsg(1, "hello,i am b");
    }
}
