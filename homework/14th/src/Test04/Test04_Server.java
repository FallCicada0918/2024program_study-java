/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-16 20:12:11
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-16 20:13:45
 * @: 無限進步
 */
package Test04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Test04_Server {
    public static void main(String[] args) throws IOException {
        // 1.搭建TCP服务器，指定端口
        ServerSocket serverSocket = new ServerSocket(8989);
        System.out.println("服务器启动，等待客户端连接...");

        while (true) {
            // 2.接收客户端的连接
            Socket clientSocket = serverSocket.accept();
            System.out.println("客户端连接成功：" + clientSocket.getInetAddress());

            // 3.单独分离子线程为当前客户端提供服务
            new Thread(() -> {
                try (
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)
                ) {
                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        // 3.1 输出读取内容
                        System.out.println("收到客户端消息: " + inputLine);

                        // 如果收到quit则跳出循环，结束当前子线程
                        if ("quit".equalsIgnoreCase(inputLine)) {
                            System.out.println("客户端请求断开连接");
                            break;
                        }

                        // 3.2 反转字符串
                        String reversedString = new StringBuilder(inputLine).reverse().toString();

                        // 3.3 将反转的字符串返回给客户端
                        out.println(reversedString);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        // 4.关闭资源
                        clientSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}