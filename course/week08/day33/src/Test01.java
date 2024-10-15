/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-15 08:56:23
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-15 09:22:19
 * @: 無限進步
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Test
 */
public class Test01 {

    public static void main(String[] args) throws IOException {
        //计时开始
        long startTime = System.currentTimeMillis();
        //创建一个普通的文件字节缓冲流
        FileInputStream fis = new FileInputStream("D:\\Users\\86138\\Desktop\\temp\\image\\pig.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\Users\\86138\\Desktop\\temp\\image\\pig_copy.jpg");
        //使用字节输入缓冲输入流 - 增强流要依赖普通流
        BufferedInputStream bis = new BufferedInputStream(fis);
        //使用字节输入缓冲输入流 - 增强流要依赖普通流
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //读取文件
        
        byte[] bytes = new byte[1024];
        int length;
        while((length = bis.read(bytes)) != -1){
            bos.write(bytes,0,length);
            
            bos.flush();
            
        }
        //计时结束
        long endTime = System.currentTimeMillis();
        System.out.println("增强流拷贝时间：" + (endTime - startTime) + "毫秒");
        //关闭流 - 之关闭增强流即可
        bis.close();
        bos.close();
    }
}