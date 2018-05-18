package websocket;

import org.java_websocket.WebSocketImpl;

import static org.junit.Assert.*;

public class WsServerTest
{

    public static void main(String []args)
    {
        WebSocketImpl.DEBUG = false;
        int port = 8887; // 端口
        WsServer s = new WsServer(port);
        s.start();
    }


}