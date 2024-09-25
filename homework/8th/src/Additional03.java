/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-25 16:50:43
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-25 16:54:21
 */
/**
 * 从键盘录入学生的信息，格式为：学号:姓名:分数，例：001:zs:78，请拆分学生信息并输出
 */
import java.util.Scanner;

public class Additional03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生信息：");
        String input = scanner.nextLine();
        String[] output = input.split(":");
        if (output.length != 3) {
            System.out.println("输入格式不正确，请重新输入！");
        }
        System.out.println("学生信息如下：");
        System.out.println("学号：" + output[0]);
        System.out.println("姓名：" + output[1]);
        System.out.println("分数：" + output[2]);
        scanner.close();
    }
}