/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-15 16:23:40
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-15 16:29:48
 * @: 無限進步
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Test0210_CharsetConvertion {
    
    public static void main(String[] args) {
        // 源文件编码格式
        String srcEncoding = "GBK";
        // 要转换的编码格式
        String distEncoding = "UTF-8";
        // 目录路径
        String dirPath = "D:/test";
        // 源文件名
        String fileName = "source.txt";
        // 创建目录对象
        File dir = new File(dirPath);
        // 创建源文件对象
        File source = new File(dir, fileName);
        // 创建目标文件对象
        File target = new File(dir, "converted_" + fileName);

        try (
            // 创建BufferedReader对象，用于读取源文件，指定编码格式为GBK
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(source), srcEncoding));
            // 创建BufferedWriter对象，用于写入目标文件，指定编码格式为UTF-8
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(target), distEncoding));
        ) {
            String line;
            // 按行读取源文件内容
            while ((line = reader.readLine()) != null) {
                // 将读取到的内容写入目标文件
                writer.write(line);
                // 写入换行符
                writer.newLine();
            }
            // 打印转换完成信息
            System.out.println("文件编码转换完成！");
        } catch (IOException e) {
            // 捕获并打印IO异常
            e.printStackTrace();
        }
        // write.close;
        // read.close;
    }
}