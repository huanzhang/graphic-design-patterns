package org.hzhang.designpatterns.behavioral.state;

/**
 * Created by Zhang Huan on 16/03/2018.
 */
public class TCPConnection {
    private TCPState state;

    public TCPConnection() {
        this.state = TCPClosed.getInstance();
    }

    public void changeState(TCPState state) {
        System.out.println("TCPConnection: Changing state to " + state.getClass().getSimpleName());
        this.state = state;
    }

    public void activeOpen() {
        System.out.println("TCPConnection: active open");
        state.activeOpen(this);
    }

    public void passiveOpen() {
        System.out.println("TCPConnection: passive open");
        state.passiveOpen(this);
    }

    public void close() {
        System.out.println("TCPConnection: close");
        state.close(this);
    }

    public void transmit(TCPOctetStream octetStream) {
        System.out.println("TCPConnection: transmit");
        state.transmit(this, octetStream);
    }

    public void receive() {
        System.out.println("TCPConnection: receive");
        state.receive(this);
    }

    public void processOctet(TCPOctetStream octetStream) {
        System.out.println("TCPConnection: processing octet");
    }

}
