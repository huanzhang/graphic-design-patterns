package org.hzhang.designpatterns.structural.decorator;

/**
 * Created by Zhang Huan on 14/03/2018.
 */
public class ConcreteComponent implements Component {
    public void operation() {
        System.out.println("ConcreteComponent's normal operation!");
    }
}
