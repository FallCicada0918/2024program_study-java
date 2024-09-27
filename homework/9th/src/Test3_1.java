/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-27 16:20:16
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-27 16:28:06
 */

 import java.util.ArrayList;

 /**
  * ArrayList去除集合中字符串的重复值(字符串的内容相同则代表重复)
  */
 public class Test3_1 {
     public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
         list.add("hello");
         list.add("world");
         list.add("hello");
         list.add("java");
         list.add("hello");
         System.out.println("集合原始数据");
         System.out.println(list);
         //删除重复元素
         // 使用for循环
         for (int i = 0; i < list.size(); i++) {
             // 从i+1开始
             // 避免重复删除
             for (int j = i + 1; j < list.size(); j++) {
                 // 判断是否相等
                 if (list.get(i).equals(list.get(j))) {
                     // 删除
                     System.out.println("删除的元素" + list.remove(j));
                     j--;
                 }
             }
         }
         System.out.println("去重后数据");
         System.out.println(list);
     }
     
 }