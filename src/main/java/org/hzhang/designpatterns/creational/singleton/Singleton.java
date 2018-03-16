package org.hzhang.designpatterns.creational.singleton;

/**
 * Created by Zhang Huan on 13/03/2018.
 */
public class Singleton {
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            return new Singleton();
        } else {
            return instance;
        }
    }

    private Singleton() {
    }

    public void singletonOperation() {
        System.out.println("singletonOperation");
    }
}
