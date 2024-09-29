/*
 * @Description:Test05LinkedList.java
 * @Author: FallCicada
 * @Date: 2024-09-27 10:48:08
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-29 09:26:33
 */

import java.util.LinkedList;
import java.util.List;

/**
 * Test04LinkedList
 */
public class Test05LinkedList {

  public static void main(String[] args) {
    // 实例化集合对象
    LinkedList<String> list = new LinkedList<String>();
    // 往集合中存放元素
    list.add("1");
    list.add("2");
    list.add("3");
    System.out.println(list);
    list.addFirst("First");
    list.addLast("Last");
    System.out.println(list.getFirst());
    System.out.println(list.getLast());
    System.out.println(list);
    System.out.println(list.removeFirst());
    System.out.println(list.removeLast());
    System.out.println(list);
    // System.out.println(list.pop());
    // System.out.println(list);
    // System.out.println(list.pop());
    // System.out.println(list);
    // System.out.println(list.pop());
    // System.out.println(list);
    // System.out.println(list.pop()); // NoSuchElementException
    System.out.println(list);
    list.push("pushElement");
    System.out.println(list);

  }
}