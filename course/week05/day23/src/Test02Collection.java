/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-26 10:48:08
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-26 11:24:48
 */
/**
 * Test02Collection
 */
import java.util.ArrayList;
import java.util.Collection;
public class Test02Collection {

    public static void main(String[] args) {
        // 实例化两个集合对象，专门存放String类型元素
        Collection<String> c1 = new ArrayList<String>();
        Collection<String> c2 = new ArrayList<>();
        // 分别给c2、c2添加元素
        String s1 = "hello";
        String s2 = "world";
        c1.add(s1);
        c1.add(s2);
        String s3 = "你好";
        String s4 = "hello";
        String s5 = "Java";
        // c1.add(s3);
        // c1.add(s5);
        c2.add(s3);
        c2.add(s4);
        c2.add(s5);
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        // 将c2添加到c1中
        c1.addAll(c2);
        System.out.println("c1: " + c1);
        // 判断是否包含某个元素
        System.out.println(c1.contains("hello"));// true
        System.out.println(c1.contains("hello1"));// false
        String s6 = new String("hello");
        String s7 = new String("world");
        // s1 == s6 ? false 所以推断contains方法用的是equals
        System.out.println(c1.contains(s6));// true
        System.out.println(c1.contains(s7));// true
        System.out.println(c1.containsAll(c2));// true?
        System.out.println("c1: " + c1);
        System.out.println("c1.size(): " + c1.size());
        System.out.println("c2: " + c2);
        // c1.remove("hello");
        c1.removeAll(c2);
        System.out.println("c1: " + c1);
        System.out.println("c1.size(): " + c1.size());
    }
}