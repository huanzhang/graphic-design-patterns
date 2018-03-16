package org.hzhang.designpatterns.behavioral.state;

/**
 * Created by Zhang Huan on 16/03/2018.
 */
public class TCPState {
    protected void activeOpen(TCPConnection connection) {

    }

    protected void changeState(TCPConnection connection, TCPState state) {
        connection.changeState(state);
    }

    protected void close(TCPConnection connection) {

    }

    protected void passiveOpen(TCPConnection connection) {

    }

    protected void receive(TCPConnection connection) {

    }

    protected void transmit(TCPConnection connection, TCPOctetStream octetStream) {

    }
}
