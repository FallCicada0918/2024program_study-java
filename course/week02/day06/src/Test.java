/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-02 09:33:44
 * @LastEditors: rendc
 * @LastEditTime: 2024-09-02 17:42:02
 */
//Test类
import java.util.Scanner;
public class Test {
    //main方法
        public static void main(String[] args) {
            //打印<   Hello Test!!!!   >
            test9();
        }
        static void Test(){
            System.out.println("Hello Test!!!");
            System.out.println("开始");
            System.out.println("语句一");
            System.out.println("语句二");
            System.out.println("语句三");
            System.out.println("语句四");
            System.out.println("结束");
        }
        static void test1(){
            int a = 1;
            int b = 2;
            if(a == 1){
                System.out.println("a = 1");
            }else if (b == 2) {
                System.out.println("b = 2");
            }else{
                System.out.println("a != 1 && b != 2");
            }
        }
        static void test2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份(例如：2024)后并按回车");
        int year = scanner.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + "是闰年");
        }else{
            System.out.println(year + "是平年");
        }
    }
        static void test3(){
        int keys = 0;
        switch (keys++) {
            case 0:
                System.out.println("如果i = 0");
                break;
            case 1:
                System.out.println("如果i = 1");
                break;
            default:
                System.out.println("如果上述条件都不满足");
                break;
        }
    }
        static void test4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入星期几(输入数字):");
        int day = scanner.nextInt();
        String s1 = "";
        switch (day){
            case 0:
                s1 = "日";
                break;
            case 1:
                s1 = "一";
                break;
            case 2:
                s1 = "二";
                break;
            case 3:
                s1 = "三";
                break;
            case 4:
                 s1 = "四";
                break;
            case 5:
                s1 = "五";
                break;
            case 6:
                s1 = "六";
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
        static void test5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份:");
        int year = scanner.nextInt();
        System.out.println("请输入一个月份：");
        int month = scanner.nextInt();
        switch (month){
            case 1: case 3: case 5:  case 7:case 8:case 10:case 12:
            int days = 31;
            // System.out.println(year + "年" + month+ "月有" + "31天");
            break;
            case 4: case 6: case 9: case 11:
            days = 30;
            // System.out.println(year + "年" + month+ "月有" + "30天");
            break;
            default:
                if((year%4==0 && year%100!=0)||year%400==0){
                    days = 29;
                    // System.out.println(year + "年" + month+ "月有" + "29天");
                }else{
                    days = 28;
                    // System.out.println(year + "年" + month+ "月有" + "28天");
                }
                System.out.println(year + "年" + month+ "月有" + days +"天");
        }
        // System.out.println(year + "年" + month+ "月有" + days +"天");
    }
        static void test6(){
        //循环
        for(int i = 0; i < 5; i++){
            System.out.println("i = " + i);
        }
    }
        static void test7(){
        int i = 0;
        while (i < 5) {
            i++;
            System.out.println("i = " + i);
            
        }
    }
        static void test8(){
        int i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);
    }
        static void test9(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个整数用于求:");
            int j = scanner.nextInt();
            int sum = 0;
            int i;
            for (i = 0; i <= j; i++) {
                sum += i; // 简化累加操作
                if (i < j) {
                    System.out.print(i + " + ");
                }
            }
            // 打印最后一个数字和最终结果
            System.out.println(j + " = " + sum);
        }
}
    