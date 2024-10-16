/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-16 17:03:40
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-16 17:31:25
 * @: 無限進步
 */
/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-16 17:03:40
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-16 17:22:35
 * @: 無限進步
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test02Server {
    //多线程 服务器
    public static void main(String[] args) throws Exception {
        //1.搭建服务器，指定端口
        ServerSocket server = new ServerSocket(8989);
        System.out.println("服务器启动成功  端口 8989...");
        while(true) {
            //2.接收客户端的连接
            Socket socket = server.accept();
            System.out.println("客户端成功连接：" + socket);
            
            // 单独分离子线程 为 当前客户端提供服务
            Thread th = new Thread() {
                @Override
                public void run() {
                    //1.获取IO流
                    BufferedReader br = null;
                    try {
                        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        //2.数据操作
                        String line = null;
                        while((line = br.readLine()) != null) {
                            System.out.println("read: " + line);
                        }
                    }catch(Exception e) {
                        e.printStackTrace();
                    }finally {
                        //3.关闭资源
                        System.out.println("客户端对应资源即将关闭!");
                        try {
                            if(br != null)
                            br.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            if(socket != null)
                                socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                 }
            };
            th.start();
        }
    }
}