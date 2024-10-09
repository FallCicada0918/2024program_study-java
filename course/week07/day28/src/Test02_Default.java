/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-09 21:28:44
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-09 21:28:45
 * @: 無限進步
 */
public class Test02_Default {
    public static void main(String[] args) {
    System.out.println("hello");
        test1();
        System.out.println("world");
    }
  
    public static void test1(){
        test2();
    }
  
    public static void test2(){
        test3();
    }
  
    public static void test3(){
        //下面代码会抛出异常
        int a = 1/0;
    }
}