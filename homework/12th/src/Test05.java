/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-11 16:46:39
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-12 08:43:04
 * @: 無限進步
 */
/**
 * 1.	定义子线程1，线程处理函数中输出 1-50，每隔5ms输出一次
 * 2.	定义子线程2，线程处理函数中输出 A-Z，每隔10ms输出一次
 * 3.	要求，当线程1输出30之后，线程2插队进来优先输出，全部输出后，线程1再输出31-50。
 */
class Thread1 extends Thread {
    private final Object lock; // 定义一个锁对象
    private final Thread2 thread2; // 定义子线程2

    public Thread1(Object lock) {
        this.lock = lock; // 构造函数，初始化锁对象
        this.thread2 = new Thread2(lock); // 初始化子线程2
    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) { // 循环输出1到50
            synchronized (lock) { // 同步锁，确保线程安全
                if (i == 31) { // 当输出到30时
                    thread2.start(); // 启动子线程2
                    try {
                        lock.wait(); // 线程等待，释放锁
                    } catch (InterruptedException e) {
                        e.printStackTrace(); // 捕获并打印异常
                    }
                }
                System.out.println(i); // 输出当前数字
                try {
                    Thread.sleep(5); // 线程休眠5毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace(); // 捕获并打印异常
                }
            }
        }
    }
}

class Thread2 extends Thread {
    private final Object lock; // 定义一个锁对象

    public Thread2(Object lock) {
        this.lock = lock; // 构造函数，初始化锁对象
    }

    @Override
    public void run() {
        synchronized (lock) { // 同步锁，确保线程安全
            for (char c = 'A'; c <= 'Z'; c++) { // 循环输出A到Z
                System.out.println(c); // 输出当前字符
                try {
                    Thread.sleep(10); // 线程休眠10毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace(); // 捕获并打印异常
                }
            }
            lock.notify(); // 唤醒等待的线程
        }
    }
}

public class Test05 {
    public static void main(String[] args) {
        Object lock = new Object(); // 创建一个锁对象
        Thread1 thread1 = new Thread1(lock); // 创建子线程1

        thread1.start(); // 启动子线程1
    }
}
