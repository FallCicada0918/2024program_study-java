/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-14 19:18:22
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-14 19:59:31
 * @: 無限進步
 */
import java.io.File;
import java.io.FilenameFilter;

public class Test012_ListFiles {
    public static void main(String[] args) {
        // 目录路径
        String path = "D:/";
        // 创建目录对象
        File dir = new File(path);
        if (dir.isDirectory()) {
            // 获取目录下的所有文件
            File[] files = dir.listFiles();
            // 遍历文件数组
            for (File file : files) {
                // 判断文件是否为目录
                if (!file.isDirectory()) {
                    //判断，如果文件后缀为 .txt或者.docx则输出文件名
                    if (file.getName().endsWith(".txt") || file.getName().endsWith(".docx")) {
                        if(file.getName().endsWith(".txt")){
                            //文件名
                            System.out.println("文本文件：" + file.getName());
                            //文件绝对路径
                            System.out.println("文件绝对路径：" + file.getAbsolutePath());
                            System.out.println("=============================");
                        }else{  
                            //文件名
                            System.out.println("Word文件：" + file.getName());
                            //文件绝对路径
                            System.out.println("文件绝对路径：" + file.getAbsolutePath());
                            System.out.println("=============================");
                        }
                    }
                }
            }
        }
    }
}