package org.hzhang.designpatterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public abstract class Mediator {
    protected Map<Integer, Colleague> colleagueMap = new HashMap<>();

    abstract void operation(int who, String str);

    abstract void register(int who, Colleague colleague);
}
