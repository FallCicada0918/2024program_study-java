/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-15 17:12:41
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-15 17:22:35
 * @: 無限進步
 */
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
/**
 * ClassWork03
 */
public class ClassWork03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        String input = scanner.nextLine();
        scanner.close();

        byte[] byteArray = input.getBytes();

        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\WorkSpace\\FallCicada_WorkSpace\\FallCicada_JAVA\\homework\\13th\\src\\dir\\b.txt");
             
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = byteArrayInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}