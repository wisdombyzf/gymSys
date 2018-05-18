package websocket;

import org.java_websocket.WebSocketImpl;

import javax.servlet.http.HttpServlet;


public class test extends HttpServlet
{
    public static void main(String []args)
    {
        System.out.println("socket服务器已启动");
        WebSocketImpl.DEBUG = false;
        int port = 8887; // 端口
        WsServer s = new WsServer(port);
        s.start();
    }
}
