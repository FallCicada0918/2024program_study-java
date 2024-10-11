/*
 * @Description: 实现Runable接口
 * @Author: FallCicada
 * @Date: 2024-10-10 15:21:19
 * @LastEditors: rendc
 * @LastEditTime: 2024-10-10 15:34:55
 */
/**
 * Test05
 */
public class Test05 {

  public static void main(String[] args) {
    Thread t1 = new Thread() {
      @Override
      public void run() {
        for (int i = 0; i < 1000000; i++) {
          if (i % 5000 == 0) {
            System.out.println("线程t1: " + i);
          }
        }
      }
    };
    Thread t2 = new Thread() {
      @Override
      public void run() {
        for (int i = 0; i < 1000000; i++) {
          if (i % 5000 == 0) {
            System.out.println("线程t2: " + i);
          }
        }
      }
    };
    // 设置优先级
    t1.setPriority(10);
    // t1.setPriority(Thread.MAX_PRIORITY);
    // t1.setPriority(1);
    t2.setPriority(Thread.MIN_PRIORITY);
    t1.start();
    t2.start();
  }
}