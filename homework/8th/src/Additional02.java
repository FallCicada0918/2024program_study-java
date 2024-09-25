/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-25 16:47:44
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-25 16:50:38
 */
/**
 * 假设用户名和密码是"admin"和"briup"，从键盘录入用户名和密码，如果匹配成功则输出"登录成功"，否则输出"登录失败，用户名或密码有误！"
 */
import java.util.Scanner;
public class Additional02 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "briup";

        System.out.println("请输入用户名：");
        String inputUsername = new Scanner(System.in).next();

        System.out.println("请输入密码：");
        String inputPassword = new Scanner(System.in).next();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("登录成功！");
        }else{
            System.out.println("登录失败，用户名或密码有误！");
        }
    }
    
}