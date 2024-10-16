/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-16 16:33:51
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-16 16:49:34
 * @: 無限進步
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test01Server {
    public static void main(String[] args) throws IOException {
        // 1.创建ServerSocket(需绑定端口，方便客户端连接)
        ServerSocket serverSocket = new ServerSocket(8989);
        System.out.println("服务器成功启动，端口 8989 ...");
        //2.调用ServerSocket的accept()方法接收客户端请求，得到一个Socket
        //  如果客户端成功连接到服务器，直接返回 套接字对象(通信)
        //  如果没有客户端连接  服务器，则阻塞
        Socket socket = serverSocket.accept();
        System.out.println("客户端成功连接: " + socket);
        
        //3.获取网络通信的IO流对象
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        
        //4.数据传输
        //  先读取 客户端发送过来的数据 并输出
        byte[] buff = new byte[1024];
        int len = is.read(buff);
        System.out.println("成功读取: ");
        System.out.println(new String(buff,0,len));
        //  再返回一条数据给 客户端
        System.out.println("即将发送数据 给 客户端...");
        os.write("hello world client".getBytes());
        System.out.println("数据成功发送!");
        //5.关闭资源
        os.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}