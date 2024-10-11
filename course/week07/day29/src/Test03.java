/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-11 10:20:32
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-11 10:21:12
 * @: 無限進步
 */
/**
 * Test03
 */
public class Test03 {

  public static void main(String[] args) {
    // 获取当前的线程对象 - 执行当前方法的线程
    Thread thread = Thread.currentThread();
    System.out.println(thread.getName());
  }

}