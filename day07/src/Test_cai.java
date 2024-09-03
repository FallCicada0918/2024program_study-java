/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-03 11:37:39
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-03 15:13:29
 */
import java.util.Random;
import java.util.Scanner;;
public class Test_cai {
    public static void main(String[] args) {
       //随机生成一个数
       Random random = new Random();
       int num = random.nextInt(100);
       Scanner scanner = new Scanner(System.in);
       System.out.println("请输入一个数字(1~100):");
       int i = 0;
       if (num > 100 || num < 1) {
        System.out.println("请读题");
       }else{
        Label:
            while(true){
                int enterNum = scanner.nextInt();
                i++;
                if(enterNum > num){
                    System.out.println("太大了");
                }else if(enterNum < num){
                    System.out.println("太小了");
                }else{
                    System.out.println("你拢共猜了"+i+"次，终于猜对了");
                    break Label;
                }
            }
            System.out.println("正确答案是" + num);
            System.out.println("游戏结束");
       }
       
    }
}