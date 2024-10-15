/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-15 16:53:48
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-15 17:03:08
 * @: 無限進步
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * TestSing
 */
public class classWork01 {

    public static void main(String[] args) {
        // 路径名、目录（文件夹）,读取文件
        try{
            FileInputStream inputPath = new FileInputStream("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\homework\\13th\\file\\a.txt");
            FileOutputStream outputPath = new FileOutputStream("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\homework\\13th\\file\\b.txt");
            int r;
            while ((r = inputPath.read()) != -1) {
                outputPath.write(r);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("执行完成");
    }
}
