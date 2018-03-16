package org.hzhang.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Zhang Huan on 16/03/2018.
 */
public abstract class Subject {
    protected List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void detach(Observer observer) {
        ListIterator<Observer> listIterator = observerList.listIterator();
        while (listIterator.hasNext()) {
            Observer o = listIterator.next();
            if (o == observer) {
                listIterator.remove();
            }
        }
    }

    public void notice() {
        ListIterator<Observer> listIterator = observerList.listIterator();
        while(listIterator.hasNext()) {
            Observer o = listIterator.next();
            o.update(this);
        }
    }

    protected abstract int getState();

    protected abstract void setState(int state);


}
