/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-25 17:34:46
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-25 17:39:48
 */



/*
 * 从键盘录入学生的信息，格式为：学号.姓名.分数，例：001.zs.78，请拆分学生信息并输出。
 * 注意：相对上面案例，当前案例中分隔符为 . 属于特殊符号，使用时需去除其特殊含义。
 */
import java.util.Scanner;
public class Additional04 {
    public static void main(String[] args) {
        System.out.println("请输入学生信息：");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] output = input.split("\\.");
        System.out.println("学号：" + output[0]);
        System.out.println("姓名：" + output[1]);
        System.out.println("分数：" + output[2]);
        scanner.close();
        return;
    }
    
}