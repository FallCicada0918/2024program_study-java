/*
 * @Description: Function
 * @Author: FallCicada
 * @Date: 2024-09-03 15:20:27
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-03 15:43:01
 */
public class Test_Function {
    //定义一个方法
    public static void main(String[] args) {
        System.out.println(add(2, 2));
        System.out.println(eva(1, 2, 3));
    }
    public static int add(int a,int b){
        int result = a + b; 
        return result;
    }
    public static double eva(int a,int b,int c){
        double result =(a+b+c)/3;
        return result; 
    }
}