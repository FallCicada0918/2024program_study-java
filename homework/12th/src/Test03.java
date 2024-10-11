/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-11 16:19:34
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-11 16:33:10
 * @: 無限進步
 */
public class Test03 extends Thread {
    public static void main(String[] args) {
        // 创建线程 t1
        Thread t1 = new Thread() {
            public void run() {
                // t1 线程运行时输出
                System.out.println("T1 is running");
            }
        };

        // 创建线程 t2
        Thread t2 = new Thread() {
            public void run() {
                try {
                    // t2 线程等待 t1 线程结束
                    t1.join();
                    // t1 线程结束后，t2 线程运行时输出
                    System.out.println("T2 is running");
                } catch (InterruptedException e) {
                    // 捕获并打印中断异常
                    e.printStackTrace();
                }
            }
        };

        // 创建线程 t3
        Thread t3 = new Thread() {
            public void run() {
                try {
                    // t3 线程等待 t2 线程结束
                    t2.join();
                    // t2 线程结束后，t3 线程运行时输出
                    System.out.println("T3 is running");
                } catch (InterruptedException e) {
                    // 捕获并打印中断异常
                    e.printStackTrace();
                }
            }
        };

        // 启动线程 t1
        t1.start();
        // 启动线程 t2
        t2.start();
        // 启动线程 t3
        t3.start();
    }
}