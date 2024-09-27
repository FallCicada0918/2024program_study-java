/*
 * @Description:List
 * 
 * @Author: rendc
 * 
 * @Date: 2024-09-27 09:32:23
 * 
 * @LastEditors: rendc
 * 
 * @LastEditTime: 2024-09-27 10:33:21
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Test02List
 */
public class Test02List {

  public static void main(String[] args) {
    // 创建一个List集合的对象
    List<String> list = new ArrayList<>();
    // 添加元素
    list.add("hello1");
    list.add("hello1");
    list.add("hello2");
    list.add("hello3");
    list.add("hello1");
    // 输出
    System.out.println(list);
    System.out.println(list.size());
    System.out.println(list.get(0));
    // System.out.println(list.get(4)); // IndexOutOfBoundsException
    System.out.println(list);
    System.out.println(list.set(0, "hello0"));
    System.out.println(list);
    list.add(0, "hello00");
    System.out.println(list);
    System.out.println(list.size());
    list.add(5, "hello5");
    System.out.println(list);
    System.out.println(list.size());
    boolean flag = list.remove("hello1");
    System.out.println(flag);
    System.out.println(list);
    System.out.println(list.size());
    String s0 = list.remove(0);
    System.out.println(s0);
    list.add("hello1");
    list.add("hello2");
    list.add("hello3");
    list.add("hello1");
    System.out.println(list);
    System.out.println(list.size());
    int result = list.indexOf("hello1");
    System.out.println(result);
    result = list.lastIndexOf("hello1");
    System.out.println(result);
    List<String> subList = list.subList(0, 3);
    System.out.println(subList);
    System.out.println(subList.size());
  }
}