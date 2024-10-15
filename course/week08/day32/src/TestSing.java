/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-14 16:13:28
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-14 16:29:11
 * @: 無限進步
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * TestSing
 */
public class TestSing {

    public static void main(String[] args) {
        // 路径名、目录（文件夹）,读取文件
        try{
            FileInputStream inputPath = new FileInputStream("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\course\\week08\\day32\\path\\a.txt");
            FileOutputStream outputPath = new FileOutputStream("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\course\\week08\\day32\\path\\b.txt");
            int r;
            while ((r = inputPath.read()) != -1) {
                outputPath.write(r);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
