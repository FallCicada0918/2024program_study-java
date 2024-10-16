/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-16 14:51:41
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-16 20:11:43
 * @: 無限進步
 */
package Test03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03_Client {
    public static void main(String[] args) throws Exception {
        // 1.定义Scanner类和要录入的字符串
        Scanner sc = new Scanner(System.in);

        // 2.定义集合存放老师信息
        List<Teacher> list = new ArrayList<>();

        // 3.逐行录入老师信息，直到遇到quit结束录入
        System.out.println("请输入老师信息,格式为：姓名-年龄-工资");
        while (true) {
            String str = sc.nextLine();
            if ("quit".equals(str)) {
                break;
            }
            // 3.1 拆分录入的字符串
            String[] strs = str.split("-");
            if (strs.length != 3) {
                System.out.println("输入格式错误，请重新输入");
                continue;
            }
            // 3.2 创建Teacher对象，并为对应属性赋值
            String name = strs[0];
            int age = Integer.parseInt(strs[1]);
            double salary = Double.parseDouble(strs[2]);
            Teacher t = new Teacher(name, age, salary);
            // 3.3 将老师对象添加到集合中
            list.add(t);
        }

        // 4.搭建TCP客户端
        try (Socket s = new Socket("127.0.0.1", 8002);
             ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
             BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()))) {

            // 5.发送集合对象
            oos.writeObject(list);
            System.out.println("集合发送成功！");
            //打印提示：客户端成功启动：Socket[addr = /127.0.0.1,port = 5000,localport = 5000]
            System.out.print("客户端启动成功" );
            System.out.println("Socket[addr = " + s.getInetAddress() + ",port = " + s.getPort() + ",localport = " + s.getLocalPort() + "]");
            // 6.从服务器接收数据
            String response = br.readLine();
            System.out.println("客户端：" + response);
        } catch (java.net.ConnectException e) {
            System.err.println("无法连接到服务器，请确保服务器已启动并在端口 8002 监听。");
        }
    }
}
