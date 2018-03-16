package org.hzhang.designpatterns.behavioral.state;

/**
 * Created by Zhang Huan on 16/03/2018.
 */
public class TCPListen extends TCPState {
    private static TCPState instance;

    private TCPListen() {
    }

    public static TCPState getInstance() {
        if (instance == null) {
            instance = new TCPListen();
        }
        return instance;
    }

    @Override
    public void receive(TCPConnection connection) {
        System.out.println("Receiving SYN");
        System.out.println("Sending SYN");
        System.out.println("Receiving ACK");
        changeState(connection, TCPEstablished.getInstance());
    }
}

