/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-11 10:20:32
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-11 10:20:37
 * @: 無限進步
 */
/*
 * @Description: 
 * @Author: rendc
 * @Date: 2024-10-10 14:54:38
 * @LastEditors: rendc
 * @LastEditTime: 2024-10-10 15:10:15
 */
/**
 * Test02
 */
public class Test02 {

  public static void main(String[] args) {
    // 通过匿名内部类创建子线程
    Thread t = new Thread("线程名字2") {
      // 重写run方法
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          System.out.println("Thread1:" + i);
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            // 思考 ：为什么异常不能抛出?
            e.printStackTrace();
          }
        }
      }
    };
    // 启动线程
    t.start();
    // 输出线程对象
    System.out.println(t.toString());
    // t.setName("线程名字");
    String name = t.getName();
    System.out.println(name);
  }
}