/*
 * @Description: Vector
 * 
 * @Author: rendc
 * 
 * @Date: 2024-09-27 14:39:37
 * 
 * @LastEditors: rendc
 * 
 * @LastEditTime: 2024-09-27 14:43:52
 */

import java.util.Vector;

/**
 * Test06Vector
 */
public class Test06Vector {

  public static void main(String[] args) {
    // 实例化一个Vector对象
    Vector<String> vector = new Vector<String>();
    // 添加元素
    vector.add("hello");
    // 早期提供的相对复杂的方法
    vector.addElement("world");
    System.out.println(vector);
  }
}