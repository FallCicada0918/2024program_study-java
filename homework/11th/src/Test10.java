/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-10 18:20:12
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-10 18:33:31
 * @: 無限進步
 */
/**
 * 1.	分别输出1~10之间的数字及对应的输出数字线程名
 * 2.	线程优先级分别为最高、普通、最低
 * 3.	每个线程输出一次后，休眠一秒钟
 * 4.	思考是否每次都是优先级最高的线程先打印输出？
 */
public class Test10 {

    public static void main(String[] args) {
        // 创建高优先级线程，并命名为 "HighPriorityThread"
        Thread highPriorityThread = new Thread(new HighPriorityThread(), "HighPriorityThread");
        // 创建普通优先级线程，并命名为 "NormalPriorityThread"
        Thread normalPriorityThread = new Thread(new NormalPriorityThread(), "NormalPriorityThread");
        // 创建低优先级线程，并命名为 "LowPriorityThread"
        Thread lowPriorityThread = new Thread(new LowPriorityThread(), "LowPriorityThread");

        // 设置高优先级线程的优先级为最大值
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        // 设置普通优先级线程的优先级为默认值
        normalPriorityThread.setPriority(Thread.NORM_PRIORITY);
        // 设置低优先级线程的优先级为最小值
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        // 输出线程的优先级
        System.out.println(highPriorityThread.getName() + " Priority: " + highPriorityThread.getPriority());
        System.out.println(normalPriorityThread.getName() + " Priority: " + normalPriorityThread.getPriority());
        System.out.println(lowPriorityThread.getName() + " Priority: " + lowPriorityThread.getPriority());

        // 启动高优先级线程
        highPriorityThread.start();
        // 启动普通优先级线程
        normalPriorityThread.start();
        // 启动低优先级线程
        lowPriorityThread.start();
    }
}

// 高优先级线程类，实现 Runnable 接口
class HighPriorityThread implements Runnable {
    @Override
    public void run() {
        // 循环输出1到10之间的数字及线程名
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                // 每次输出后休眠一秒钟
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 普通优先级线程类，实现 Runnable 接口
class NormalPriorityThread implements Runnable {
    @Override
    public void run() {
        // 循环输出1到10之间的数字及线程名
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                // 每次输出后休眠一秒钟
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 低优先级线程类，实现 Runnable 接口
class LowPriorityThread implements Runnable {
    @Override
    public void run() {
        // 循环输出1到10之间的数字及线程名
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                // 每次输出后休眠一秒钟
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}