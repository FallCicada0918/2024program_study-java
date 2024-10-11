/*
 * @Description: 测试类
 * @Author: FallCicada
 * @Date: 2024-10-10 11:38:17
 * @LastEditors: rendc
 * @LastEditTime: 2024-10-10 14:39:18
 */
public class Test01 {
  public static void main(String[] args) throws InterruptedException {
    // 创建线程对象并启动线程
    Thread t = new MyThread();
    // 启动线程 调用start方法
    t.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("Main,hello");
      Thread.sleep(1000);
    }
  }
}