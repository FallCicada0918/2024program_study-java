/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-10 19:20:06
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-10 19:21:38
 * @: 無限進步
 */
/**
 *编写程序，实现创建一个线程，并调用方法实现输出这个线程状态所经历的NEW、RUNNABLE、TIMED_WAITING和TERMINATED状态。
 */
public class Test13 {

    public static void main(String[] args) {
        // 创建线程对象
        Thread thread = new Thread(new MyThread());

        // 输出线程状态：NEW
        System.out.println("Thread state: " + thread.getState());

        // 启动线程
        thread.start();

        // 输出线程状态：RUNNABLE
        System.out.println("Thread state: " + thread.getState());

        try {
            // 让主线程休眠500毫秒，确保子线程进入TIMED_WAITING状态
            Thread.sleep(500);
            // 输出线程状态：TIMED_WAITING
            System.out.println("Thread state: " + thread.getState());

            // 等待子线程结束
            thread.join();
            // 输出线程状态：TERMINATED
            System.out.println("Thread state: " + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        try {
            // 让线程休眠1000毫秒，模拟TIMED_WAITING状态
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}