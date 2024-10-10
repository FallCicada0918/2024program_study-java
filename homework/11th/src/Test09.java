/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-10 17:40:53
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-10 18:18:37
 * @: 無限進步
 */
/**
 * 请编写一个Java程序，创建两个线程，一个打印50以内的奇数，另一个打印50以内的偶数
 */
public class Test09 {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddThread());
        Thread evenThread = new Thread(new EvenThread());

        oddThread.start();
        evenThread.start();
    }
}

class OddThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 50; i += 2) {
            System.out.println("Odd: " + i );
        }
    }
}

class EvenThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i += 2) {
            System.out.println("Even: " + i );
        }
    }
}