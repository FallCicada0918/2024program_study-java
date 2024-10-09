/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-09 21:29:25
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-09 21:29:30
 * @: 無限進步
 */

import java.util.Scanner;
//手动抛出异常对象
public class Test02_Throw {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please input username and password: ");
    String username = sc.nextLine();
    String password = sc.nextLine();
        login(username,password);
    }
    public static void login(String name, String passwd) {
        if("root".equals(name) && "briup".equals(passwd)) {
            System.out.println("登录成功!");
        }else {
            //抛出运行时异常
            throw new RuntimeException("用户名或密码录入有误")String username = sc.nextLine();
            String password = sc.nextLine();
            login(username,password);
    }
    public static void login(String name, String passwd) {
        if("root".equals(name) && "briup".equals(passwd)) {
            System.out.println("登录成功!");
        }else {
            //抛出运行时异常
            throw new RuntimeException("用户名或密码录入有误");
        }
    }
}