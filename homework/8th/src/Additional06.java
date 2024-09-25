/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-25 18:51:26
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-25 18:54:33
 */
/**
 * 从键盘录入一个手机号，将中间四位号码修改为 **** 输出，如键盘录入13800001234 ，处理后最终效果为： 138****1234 。(使用replace)
 */
import java.util.Scanner;
public class Additional06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String phoneNumber = scanner.nextLine();
        String newPhone = phoneNumber.replace(phoneNumber.substring(4, 8), "****");
        scanner.close();
        if(phoneNumber.length()!=11){
            System.out.println("输入有误，请重新输入");
            
        }else{
            System.out.println("原手机号为：");
            System.out.println(newPhone);
        }
        
    }
}