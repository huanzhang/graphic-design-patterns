package org.hzhang.designpatterns.behavioral.command;

/**
 * Created by Zhang Huan on 15/03/2018.
 */
public class TVOpenCommand implements Command {
    private Television television;

    public TVOpenCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.open();
    }
}
