/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-11 16:38:51
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-11 16:45:04
 * @: 無限進步
 */
/**
 * 编写程序，创建线程，将该线程睡眠，然后打断该线程睡眠状态，查看是否被打断。
 */
public class Test04 extends Thread {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                try {
                    System.out.println("线程即将进入睡眠。"); // 输出线程即将进入睡眠
                    Thread.sleep(10000); // 线程睡眠10秒
                } catch (InterruptedException e) {
                    System.out.println("线程在睡眠期间被打断。"); // 输出线程在睡眠期间被打断
                }
            }
        };
        t.start(); // 启动线程
        try {
            Thread.sleep(2000); // 确保线程开始睡眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt(); // 打断线程
        System.out.println("线程打断状态: " + t.isInterrupted()); // 输出线程打断状态
    }
}

