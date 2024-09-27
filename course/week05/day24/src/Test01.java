/*
 * @Description: 集合遍历
 * 
 * @Author: rendc
 * 
 * @Date: 2024-09-27 08:51:39
 * 
 * @LastEditors: rendc
 * 
 * @LastEditTime: 2024-09-27 09:27:24
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Test01
 */
public class Test01 {

  public static void main(String[] args) {
    // 创建一个String类的集合对象
    Collection<String> c1 = new ArrayList<>();
    // 创建字符串对象
    String s1 = "hello";
    String s2 = "world";
    String s3 = "java";
    // 将元素添加到集合中
    c1.add(s1);
    c1.add(s2);
    c1.add(s3);
    // 输出集合
    System.out.println(c1);
    System.out.println(c1.size());
    // 集合的遍历
    // 1. 使用 toArray() 将集合的元素放到数组中，再去遍历
    Object[] arr = c1.toArray();
    // 遍历数组
    for (Object object : arr) {
      System.out.println(object);
    }
    // 2. 使用增强for循环直接遍历集合
    for (String str : c1) {
      System.out.println(str);
    }
    // 3. 迭代器
    // 获取一个迭代器对象 - 注意导包
    Iterator<String> iterator = c1.iterator();
    // 通过 hasNext() 方法判断集合是否还有下一个元素 使用 next() 方法，获取下一个元素
    while (iterator.hasNext()) {
      String s = iterator.next();
      c1.remove(s3);
      System.out.println(s);
    }
  }
}