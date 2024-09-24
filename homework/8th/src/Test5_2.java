/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-23 19:57:24
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-23 20:18:29
 */
public class Test5_2 {

    public static void main(String[] args) {
        // 创建两个值相同的Integer对象，使用new关键字
        Integer i1 = new Integer(97);
        Integer i2 = new Integer(97);
        // 输出两个对象的引用是否相同，false
        System.out.println(i1 == i2);
        // 使用equals方法比较两个对象的值，true
        System.out.println(i1.equals(i2));
        // 创建两个值相同的Integer对象，使用new关键字，值为148
        Integer i3 = new Integer(148);
        Integer i4 = new Integer(148);
        // 输出两个对象的引用是否相同，false
        System.out.println(i3 == i4);
        // 使用equals方法比较两个对象的值，true
        System.out.println(i3.equals(i4));
        // 使用Integer缓存池中的对象，值为97
        Integer i5 = 97; 
        Integer i6 = 97; 
        // 输出两个对象的引用是否相同，true，因为值在缓存范围内
        System.out.println(i5 == i6);
        // 使用equals方法比较两个对象的值，true
        System.out.println(i5.equals(i6));
        // 使用Integer缓存池中的对象，值为148
        Integer i7 = 148;
        Integer i8 = 148;
        // 输出两个对象的引用是否相同，true，因为值在缓存范围内
        System.out.println(i7 == i8);
        // 使用equals方法比较两个对象的值，true
        System.out.println(i7.equals(i8));
        // 定义基本类型int变量a，值为148
        int a = 148; 
        // 定义基本类型int变量b，值为97
        int b = 97; 
        // 定义Integer对象c，值为97，从缓存中获取
        Integer c = 97;
        // 比较Integer对象i7和基本类型int变量a的值，true
        System.out.println(i7 == a);
        // 比较基本类型int变量b和Integer对象c的值，true
        System.out.println(b == c);
    }
}