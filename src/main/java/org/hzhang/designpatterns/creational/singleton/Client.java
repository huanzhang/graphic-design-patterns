package org.hzhang.designpatterns.creational.singleton;

/**
 * Created by Zhang Huan on 13/03/2018.
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.singletonOperation();
    }
}
