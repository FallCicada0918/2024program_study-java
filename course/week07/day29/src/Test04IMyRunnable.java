/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-10 15:25:46
 * @LastEditors: rendc
 * @LastEditTime: 2024-10-10 15:45:01
 */
/**
 * Test04IMyRunnable
 */
public class Test04IMyRunnable {

  public static void main(String[] args) {
    Runnable r = new IMyRunnable();
    // r.run();
    Thread t = new Thread(r, "新线程");
    t.start(); // 启动线程
    // 匿名内部类的方式创建 Runnable 实现类的对象
    Runnable r2 = new Runnable() {
      @Override
      public void run() {
        // 线程要处理的内容
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
          System.out.println(name + ":" + i);
        }
      }
    };
    Thread t2Thread = new Thread(r2);
    t2Thread.setName("t2线程");
    t2Thread.start(); // 启动线程
    t.setPriority(1);
    System.out.println(t.getPriority());
    t2Thread.setPriority(10);
    System.out.println(t2Thread.getPriority());
  }
}