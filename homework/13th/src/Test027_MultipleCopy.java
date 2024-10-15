/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-14 20:28:02
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-14 20:28:07
 * @: 無限進步
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test027_MultipleCopy {

    public static void main(String[] args) {
        // 源文件所在路径
        String dirPath = "D:/test";
        // 源文件名称
        String fileName = "img.jpg";
        // 复制数量
        int number = 10;

        // 创建源文件对象
        File sourceFile = new File(dirPath, fileName);

        // 循环复制文件
        for (int i = 1; i <= number; i++) {
            File destFile = new File(dirPath, "img_copy" + i + ".jpg");
            copyFile(sourceFile, destFile);
        }
    }

    private static void copyFile(File source, File dest) {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}