package org.hzhang.designpatterns.behavioral.mediator;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void operation(int who, String str) {
        Colleague colleague = colleagueMap.get(who);
        if (colleague == null) {
            System.out.println("not found this colleague!");
            return;
        }

        colleague.receivemsg(str);
    }

    @Override
    public void register(int who, Colleague colleague) {
        Colleague c = colleagueMap.get(who);
        if (c == null) {
            colleagueMap.put(who, colleague);
            colleague.setMediator(this);
        }
    }
}
