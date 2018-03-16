package org.hzhang.designpatterns.behavioral.command;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class Application {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.call();

        Television television = new Television();
        Command openCommand = new TVOpenCommand(television);
        Command closeCommand = new TVCloseCommand(television);
        Controller controller = new Controller(openCommand, closeCommand);
        controller.open();
        controller.off();
    }
}
