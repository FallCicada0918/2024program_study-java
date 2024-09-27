/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-27 10:48:06
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-27 11:03:38
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
     System.out.println("LinkedList插入" + NUM + "次耗时：" + (end - start) + "ms");
     // 开始计时
     long start1 = System.currentTimeMillis();
     for (int i = 0; i < NUM; i++) {
       list.get(i);
     }
     // 结束计时
     long end1 = System.currentTimeMillis();
     // 计算时间
     System.out.println("LinkedList查询" + NUM + "次耗时：" + (end1 - start1) + "ms");
   }
 }