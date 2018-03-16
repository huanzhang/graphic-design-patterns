package org.hzhang.designpatterns.behavioral.command;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("invoker calling");
        command.execute();
    }
}
