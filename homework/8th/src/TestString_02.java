/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-24 17:01:57
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-24 17:05:28
 */
public class TestString_02{

    public static void main(String[] args){
        // 初始化一个字符串常量，表示"helloworld"
        String s1 = "helloworld";
        // 初始化两个字符串常量，分别表示"hello"和"world"
        String s2 = "hello";
        String s3 = "world";
        // 通过直接连接两个字符串常量创建一个新的字符串常量，表示"helloworld"
        String s4 = "hello" + "world";
        // 通过连接两个字符串变量创建一个新的字符串常量，表示"helloworld"
        String s5 = s2 + s3;
        // 初始化一个新的字符串对象，表示"helloword"
        String s6 = new String("helloword");
        // 通过连接一个字符串常量和一个新的字符串对象创建一个新的字符串对象，表示"helloworld"
        String s7 = "hello" + new String("world");
        // 比较s1和s4是否指向相同的字符串常量池对象，输出true，因为它们是相同的常量
        System.out.println(s1 == s4);
        // 比较s1和s5是否指向相同的字符串对象，输出false，因为字符串拼接会在堆上创建新对象
        System.out.println(s1 == s5);
        // 比较s1和s6是否指向相同的字符串对象，输出false，因为s6是一个不同的对象
        System.out.println(s1 == s6);
        // 比较s1和s7是否指向相同的字符串对象，输出false，因为字符串拼接会导致新对象的创建
        System.out.println(s1 == s7);
    }
}
