package org.hzhang.designpatterns.behavioral.state;

/**
 * Created by Zhang Huan on 16/03/2018.
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.request();
        context.request();
        context.request();

        TCPConnection activeConnection = new TCPConnection();
        activeConnection.activeOpen();
        activeConnection.transmit(new TCPOctetStream());
        activeConnection.close();

        TCPConnection passiveConnection = new TCPConnection();
        passiveConnection.passiveOpen();
        passiveConnection.receive();
        passiveConnection.transmit(new TCPOctetStream());
        passiveConnection.close();
    }
}
