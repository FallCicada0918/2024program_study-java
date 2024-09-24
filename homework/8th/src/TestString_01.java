/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-24 16:53:10
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-24 16:58:49
 */
public class TestString_01 {
   
    public static void main(String[] args) {
        // 字符串字面量，它们在字符串常量池中存储
        String str1 = "hello";
        String str2 = "hello";
        
        // 通过new关键字创建的字符串对象，它们在堆内存中存储
        String str3 = new String("hello");
        String str4 = new String("hello");
        
        // 字符串拼接操作，结果存储在另一个字符串变量中
        String str5 = "hellohello";
        String str6 = str1 + str2;
        
        // 使用==比较字符串对象的引用，展示str1和str2引用相同对象
        System.out.println(str1 == str2);// true
        
        // 展示str2和str3虽然内容相同，但引用不同
        System.out.println(str2 == str3);// false
        
        // 展示str3和str4都是通过new创建的，所以引用不同
        System.out.println(str3 == str4);// false
        
        // 使用equals方法比较字符串的内容，展示str2和str3内容相同
        System.out.println(str2.equals(str3));// true
        
        // 再次验证通过equals方法，str3和str4内容相同
        System.out.println(str3.equals(str4));// true
        
        // 验证str5和str6内容相同但不是同一个对象引用
        System.out.println(str5.equals(str6));// true
        
        // 验证str5和str6虽然内容相同，但使用==比较时为false，因为它们是不同的对象引用
        System.out.println(str5 == str6);// false
    }
}