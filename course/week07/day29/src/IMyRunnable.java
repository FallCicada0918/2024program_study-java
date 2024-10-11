/*
 * @Description: 实现Runable接口
 * @Author: FallCicada
 * @Date: 2024-10-10 15:21:19
 * @LastEditors: rendc
 * @LastEditTime: 2024-10-10 15:34:55
 */
/**
 * IMyRunable- 创建一个Runable的实现类
 */
public class IMyRunnable implements Runnable {
  // 重写run方法
  @Override
  public void run() {
    // 线程要处理的内容
    String name = Thread.currentThread().getName();
    for (int i = 0; i < 10; i++) {
      System.out.println(name + ":" + i);
    }
  }
}