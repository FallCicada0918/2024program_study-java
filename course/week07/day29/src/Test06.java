/*
 * @Description: 实现Runable接口
 * @Author: FallCicada
 * @Date: 2024-10-10 15:21:19
 * @LastEditors: rendc
 * @LastEditTime: 2024-10-10 15:34:55
 */
/**
 * Test06
 */
public class Test06 {

  public static void main(String[] args) {
    Thread t1 = new Thread() {
      @Override
      public void run() {
        for (int i = 1; i < 41; i++) {
          System.out.println("线程t1: " + i);
          try {
            Thread.sleep(10);
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      }
    };
    Thread t2 = new Thread() {
      @Override
      public void run() {
        for (int i = 100; i >= 70; i--) {
          System.out.println("线程t2: " + i);
          try {
            Thread.sleep(10);
            if (i == 80) {
              // t1.join();
              t1.join(50);
            }
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      }
    };
    t1.start();
    t2.start();
    // 主线程 用于输出 t2 的状态
    for (int i = 0; i < 50; i++) {
      System.out.println("t2的状态" + t2.getState());
      try {
        Thread.sleep(10);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}