/**
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-16 16:24:46
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-16 17:17:53
 * @: 無限進步
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
  * Test01
  */
public class Test02Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        //创建一个Socket对象
        //准备连接服务器
        Socket socket = new Socket("127.0.0.1",8989);
        System.out.println("成功连接到 8989服务器,socket: " + socket);
        //2.获取数据传输的IO流
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        //3.数据传输【跟服务器 业务配合 起来】
        // 先发送数据给服务器
        os.write("hello server, 我是Tcp客户端".getBytes());
        System.out.println("数据发送完成！");
        //再接收从服务器返回的数据
        byte[] buff = new byte[1024];
        int len = is.read(buff);
        System.out.println("read: " + new String(buff,0,len));
        //4.关闭资源
        os.close();
        is.close();
        socket.close();
    }
}