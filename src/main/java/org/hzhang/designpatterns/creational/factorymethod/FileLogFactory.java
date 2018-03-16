package org.hzhang.designpatterns.creational.factorymethod;

/**
 * Created by Zhang Huan on 13/03/2018.
 */
public class FileLogFactory implements LogFactory {
    public Log createLog() {
        return new FileLog();
    }
}
