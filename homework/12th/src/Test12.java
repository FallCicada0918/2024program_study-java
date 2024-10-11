/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-11 21:25:45
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-11 21:28:59
 * @: 無限進步
 */
public class Test12 {
    public static void main(String[] args) {
        // 创建两个对象，作为锁对象
        Object obj1 = new Object();
        Object obj2 = new Object();

        // 创建第一个线程
        Thread th1 = new Thread() {
            @Override
            public void run() {
                // 循环100次
                for (int i = 0; i < 100; i++) {
                    // 同步块，锁住obj1
                    synchronized (obj1) {
                        System.out.println("th1拿起了笔");
                        // 同步块，锁住obj2
                        synchronized (obj2) {
                            System.out.println("th1拿到了纸");
                            System.out.println("th1写起了入党申请书");
                        }
                    }
                }
            }
        };
        // 创建第二个线程
        Thread th2 = new Thread() {
            @Override
            public void run() {
                // 循环100次
                for (int i = 0; i < 100; i++) {
                    // 同步块，锁住obj2
                    synchronized (obj2) {
                        System.out.println("th2拿到了纸");
                        // 同步块，锁住obj1
                        synchronized (obj1) {
                            System.out.println("th2拿到了笔");
                            System.out.println("th2写起了入党申请书");
                        }
                    }
                }
            }
        };
        // 启动第一个线程
        th1.start();
        // 启动第二个线程
        th2.start();
    }
}