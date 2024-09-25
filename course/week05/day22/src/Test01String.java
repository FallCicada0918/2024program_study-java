/*
 * @Description: String
 * @Author: FallCicada
 * @Date: 2024-09-25 10:36:03
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-25 14:46:44
 */
public class Test01String{
    public static void main(String[] args) {
        //创建一个空白的字符串对象
        String str = new String();
        System.out.println("str:" + str);
        //根据字符串创建字符串对象
        char[] ch = {'a','b','c'};
        String str1 = new String(ch);
        System.out.println("str1:" + str1);
        //根据一个字符串，直接创建字符串对象
        
        
    }
}