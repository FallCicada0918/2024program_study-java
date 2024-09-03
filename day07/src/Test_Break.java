/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-03 08:44:00
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-03 10:53:23
 */
public class Test_Break {
    public static void main(String[] args){
        // testContinue();
        // Test01_Gai();
        // Test_Gai();
        // test01();
        // test_nest();
        // test_nest01();
        // test_nest02();
        test_nest03();
        rotate90DegreesClockwise();
        rotate180DegreesClockwise();
        rotate270DegreesClockwise();
    }
    static void testBreak(){
        System.out.println("Hello world!");
        for(int i = 0; i < 10; i++){
            System.out.println("i = " + i);
        }
    }
    static void testContinue(){
        for(int i = 0; i < 10; i++){
            if(i == 5 || i == 8){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
    static void test01(){
        int day = 0;
        float money = 0;
        while (money <= 100) {
         day = day + 1;
         money = (float) (money + 2.5);
         if (day % 5 ==0) {
             money -= 6;
             System.out.println("第"+day+"天，花了5块============");
         }
         System.out.println("第"+day+"天，余额为"+money);
        } 
    }
    static void Test_Gai(){
            int day = 0;
            float money = 0;
            while (money <= 100) { 
                day += 1;
                money = (float) (money + 2.5);
        
                // 如果是第5天的倍数并且余额大于等于6，则扣除6元，否则跳过本次循环
                if (day % 5 == 0) {
                    if (money >= 6) {
                        money -= 6;
                    } else {
                        continue; // 跳过本次循环，不打印信息
                    }
                }
        
                System.out.println("第" + day + "天，余额为" + money);
        
                // 当余额超过80时，提前结束循环
                if (money > 100) {
                    break;
                }
            }
    }
    static void test_nest(){
        for(int i = 5; i >= 1; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*"+ " ");
                    
            }
            System.out.println("");
            
        }
    }
    static void test_nest01(){
        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*"+ " ");
                    
            }
            System.out.println("");
            
        }
    }
    static void test_nest02(){
        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < i; j++){
                for(int k = 0; k < j; k++){
                    System.out.print(" ");
                }
                System.out.print("*"+ " ");
                    
            }
            System.out.println("");
            
        }
    }
    static void test_nest03() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* " + " ");
            }
            System.out.println("");
        }
    }

    static void rotate90DegreesClockwise() {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j >= 0; j--) {
                if (j >= i) {
                    System.out.print("* " + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    static void rotate180DegreesClockwise() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* " + " ");
            }
            System.out.println("");
        }
    }

    static void rotate270DegreesClockwise() {
        int size = 5;
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < size; j++) {
                if (i >= j) {
                    System.out.print("* " + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

}