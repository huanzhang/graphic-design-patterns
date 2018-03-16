package org.hzhang.designpatterns.behavioral.command;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class Controller {
    private Command openCommand;
    private Command closeCommand;

    public Controller(Command openCommand, Command closeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
    }

    public void open() {
        openCommand.execute();
    }

    public void off() {
        closeCommand.execute();
    }
}
