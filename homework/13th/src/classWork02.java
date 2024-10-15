/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-15 17:05:19
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-15 17:09:21
 * @: 無限進步
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * TestSing
 */
public class classWork02 {

    public static void main(String[] args) {
        // 路径名、目录（文件夹）,读取文件
        try {
            FileInputStream inputPath = new FileInputStream("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\homework\\13th\\file\\a.txt");
            FileOutputStream outputPath = new FileOutputStream("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\homework\\13th\\file\\a_copy.txt");
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputPath.read(buffer)) != -1) {
                outputPath.write(buffer, 0, bytesRead);
            }
            inputPath.close();
            outputPath.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("执行完成");
    }
}
