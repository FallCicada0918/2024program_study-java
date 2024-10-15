/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-15 09:24:55
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-15 09:47:20
 * @: 無限進步
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Test03
 */
public class Test03 {

    public static void main(String[] args) throws IOException {
        //计时开始
        long startTime = System.currentTimeMillis();
        //创建一个普通的文件字符缓冲流
        BufferedReader fr = new BufferedReader(new FileReader("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\course\\week08\\day32\\path\\b.txt"));
        BufferedWriter fw = new BufferedWriter(new FileWriter("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\course\\week08\\day32\\path\\b_Copy.txt"));
        //使用字符输入缓冲输入流 - 增强流要依赖普通流
        BufferedReader br = new BufferedReader(fr);
        //使用字符输入缓冲输入流 - 增强流要依赖普通流
        BufferedWriter bw = new BufferedWriter(fw);

        //读取文件
        String line;
        while((line = br.readLine()) != null){

            System.out.println("读取到的数据 : " + line);
            //整行写入
            bw.write(line);
            //bw.newLine();
            //bw.flush();
            if(br.ready()){
                //ready方法返回false值代表马上到文件尾
                bw.newLine();
            }
        }
        //计时结束
        long endTime = System.currentTimeMillis();
        System.out.println("增强流拷贝时间：" + (endTime - startTime) + "毫秒");
        //关闭流 - 之关闭增强流即可
        bw.close();
        br.close();
    }
}