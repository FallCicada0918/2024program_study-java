/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-16 20:14:22
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-16 20:14:54
 * @: 無限進步
 */

package Test04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Test04_Client {
    public static void main(String[] args) throws IOException {
        // 1.搭建TCP客户端
        Socket socket = new Socket("localhost", 12345);
        
        // 2.封装得到IO流
        BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
        String userInput;
        while (true) {
            // 3.1 逐行读取键盘信息
            userInput = keyboardInput.readLine();
            
            // 3.2 发送信息给服务器
            out.println(userInput);
            
            // 如果遇到quit则结束录入
            if ("quit".equalsIgnoreCase(userInput)) {
                break;
            }
            
            // 3.3 读取服务器返回信息并显式
            String serverResponse = in.readLine();
            System.out.println("Server: " + serverResponse);
        }
        
        // 4.关闭资源
        in.close();
        out.close();
        keyboardInput.close();
        socket.close();
    }
}