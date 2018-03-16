package org.hzhang.designpatterns.behavioral.command;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("ConcreteCommand::execute");
        receiver.action();
    }
}
