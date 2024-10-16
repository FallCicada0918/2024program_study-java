/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-16 14:52:33
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-16 19:55:26
 * @: 無限進步
 */
package Test03;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Test03_Server {
    public static void main(String[] args) throws Exception {
        // 1.搭建TCP服务器
        int port = 8002;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务器已启动，等待客户端连接...");

        // 2.接收客户端的连接
        Socket socket = serverSocket.accept();
        System.out.println("客户端已连接" + socket);

        // 3.读取客户端传递的Teacher集合并遍历
        // 3.1 获取输入流并封装成对象流
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

        // 3.2 读取集合对象并遍历
        @SuppressWarnings("unchecked")
        List<Teacher> teacherList = (List<Teacher>) ois.readObject();
        for (Teacher teacher : teacherList) {
            System.out.println("接收到老师信息: " + teacher.toString());
        }

        // 4.将集合对象(含所有老师信息)写入本地文件t.txt，txt文件位置 src/t.txt
        // 4.1 定义文件输出流并封装成对象流
        FileOutputStream fos = new FileOutputStream("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\homework\\14th\\src\\t.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 4.2 向t.txt文件中写入数据
        oos.writeObject(teacherList);
        oos.close();
        System.out.println("老师信息已写入文件");

        // 5.返回响应信息给客户端
        // 5.1 获取输出流并封装成缓冲流
        OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());

        // 5.2 返回ok信息给客户端
        osw.write("ok");
        osw.flush();
        System.out.println("已返回响应信息给客户端");

        // 6.关闭资源
        ois.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务器已关闭");
    }
}

