/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-25 16:41:04
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-25 17:21:16
 */
/**
 * 从键盘录入一行字符串，获取其长度和索引2位置上的字符，最后统计字符串中数字字符的个数。
 */
import java.util.Scanner;

public class Additional01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        String str = sc.nextLine();
        System.out.println("长度为：" + str.length());
        System.out.println("索引2位置上的字符为：" + str.charAt(2));
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }
        System.out.println("数字字符的个数为：" + count);
        sc.close();
        
    }
}