/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-25 18:38:28
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-25 18:48:33
 */
/**
 * 从键盘录入一个手机号，将中间四位号码修改为 **** 输出，如键盘录入13800001234 ，处理后最终效果为： 138****1234 。(不能用replace)
 */
import java.util.Scanner;

public class Additional05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个手机号(+86):");
        String phoneNumber = sc.nextLine();
        if (phoneNumber.length ()!= 11) {
            System.out.println("输入有误，请重新输入");
        }else{
            System.out.println(phoneNumber.substring(0, 3) + "****" + phoneNumber.substring(7));
        }
        // System.out.println(phoneNumber.substring(0, 3) + "****" + phoneNumber.substring(7, phoneNumber.length()));
        
    }
}