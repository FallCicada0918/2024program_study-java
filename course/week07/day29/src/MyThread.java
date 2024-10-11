/*
 * @Description: 线程子类
 * @Author: FallCicada
 * @Date: 2024-10-10 14:31:58
 * @LastEditors: rendc
 * @LastEditTime: 2024-10-10 14:50:52
 */
/**
 * MyThread
 * Thread类属于lang包 不需要导包
 */
public class MyThread extends Thread {
  // 重写run方法 - 指定线程执行的任务
  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Thread,run");
      try {
        Thread.sleep(1000);// 让当前执行代码的线程睡眠1000毫秒
      } catch (InterruptedException e) {
        // 当线程执行中断 会抛出这个异常
        // sleep wait 等
        System.out.println("线程中断");
        e.printStackTrace();
      }
    }
  }
}