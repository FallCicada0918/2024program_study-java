/*
 * @Description:Test04LinkedList.java
 * 
 * @Author: rendc
 * 
 * @Date: 2024-09-27 10:48:08
 * 
 * @LastEditors: rendc
 * 
 * @LastEditTime: 2024-09-27 11:00:45
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Test04LinkedList
 */
public class Test04LinkedList {

  public static void main(String[] args) {
    // 操作集合的次数
    final int NUM = 100000;
    // 实例化集合对象
    // List<String> list = new ArrayList<String>();
    LinkedList<String> list = new LinkedList<String>();
    // 往集合中存放元素
    // 开始计时
    long start = System.currentTimeMillis();
    for (int i = 0; i < NUM; i++) {
      list.add(0, "hello" + i);
    }
    // 结束计时
    long end = System.currentTimeMillis();
    // 计算时间
    System.out.println("插入" + NUM + "条数据用时：" + (end - start) + "毫秒");
    // 开始计时
    long start1 = System.currentTimeMillis();
    for (int i = 0; i < NUM; i++) {
      list.get(i);
    }
    // 结束计时
    long end1 = System.currentTimeMillis();
    // 计算时间
    System.out.println("查询" + NUM + "条数据用时：" + (end1 - start1) + "毫秒");
  }
}