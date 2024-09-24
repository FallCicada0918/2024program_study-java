/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-24 14:49:47
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-24 15:13:17
 */
public class Test03 {
    public static void main(String[] args) {
        //数字型a转换为String类型
        int a = 1;
        //a.toString
        //把int类型转换为Tntereger
        Integer o = Integer.valueOf(0);
        Integer o1 = a;//自动装箱
        System.out.println(o.toString());
        // Integer -> int
        int i = o.intValue(); 
        int i1 = o1;//自动拆箱
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        //是Integer类提供的一个进制转换的方法第一个数字是要转换的十进制数字，第二个数字是目标进制
        System.out.println(Integer.toString(100,10));
        System.out.println(Integer.toString(100,2));
        System.out.println(Integer.toString(100,8));
        System.out.println(Integer.toString(100,16));
        
        // 字符串数字转换为int类型“100”
        int num = Integer.parseInt("100");
        System.out.println("num: " + num);
        
    }
}