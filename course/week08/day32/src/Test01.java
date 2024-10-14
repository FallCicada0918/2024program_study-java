/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-14 10:14:57
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-14 09:46:25
 * @: 無限進步
 */
import java.io.File;
import java.io.IOException;

/**
 * Test01
 */
public class Test01 {

    public static void main(String[] args) {
        // 路径名、目录（文件夹）
        String pathName = "D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\course\\week08\\day32\\path\\Test.txt";
        // 创建文件对象
        File file1 = new File(pathName);
        //获取路径
        System.out.println(file1);
        System.out.println(file1.getPath());
        //获取文件名
        System.out.println(file1.getName());
        File file2 = new File("Test01.java");
        System.out.println(file2.getAbsolutePath());  
        //获取文件长度（字节长度）
        System.out.println(file2.length() + "字节");
        System.out.println(file2.length() / 1024 + "KB");
        File file3 = new File("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\course\\week08\\day32\\path");
        System.out.println(file3.getName());
        System.out.println(file3.length());
        //对于目录来说，返回值未指定
        //判断是否是文件
        System.out.println(file1.isFile());
        //判断是否是目录
        System.out.println(file1.isDirectory());
        //创建文件时，判断文件是否存在，文件名是否冲突
        //判断文件是否存在
        if (file1.exists()) {
            System.out.println("文件已存在,请勿重复创建");
        } else {
            try{
                System.out.println(file1.createNewFile());
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        //创建文件夹
        String pathName2 = "D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\course\\week08\\day32\\path\\file";
        File file4 = new File(pathName2);
        if (file4.exists()) {
            System.out.println("文件夹已存在,请勿重复创建");
        } else {
            file4.mkdir();
        }
        //多级目录创建
        String pathName3 = "D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\course\\week08\\day32\\path\\file\\file1\\file2";
        File file5 = new File(pathName3);
        if (file5.exists()) {
            System.out.println("文件夹已存在,请勿重复创建");
        } else {
            file5.mkdirs();
        }
        //文件或者目录的删除
        //delete()方法只能删除空文件夹
    }
}