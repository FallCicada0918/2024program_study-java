/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-11 17:32:00
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-11 17:36:01
 * @: 無限進步
 */
/**
 * 1.	有多个生产者(Productor)每间隔1秒将生产的一个产品交给店员(Clerk)
 * 2.	有多个消费者(Customer)每间隔1秒可以从店员处购买一个产品
 * 3.	一个店员最多能管理20个产品
 * 4.	如果店员管理的产品数量超过20个，店员会叫生产者停止生产
 * 5.	如果店员管理的产品数量低于20个，再通知生产者继续生产
 * 6.	如果店员中没有产品了，店员会告诉消费者等一下，当有产品时，通知消费者购买产品
 */
public class Test10 {
    public static void main(String[] args) {
        // 创建一个店员对象
        Clerk clerk = new Clerk();
        // 创建两个生产者对象，并将店员对象传递给它们
        Producer producer1 = new Producer(clerk);
        Producer producer2 = new Producer(clerk);
        // 创建两个消费者对象，并将店员对象传递给它们
        Consumer consumer1 = new Consumer(clerk);
        Consumer consumer2 = new Consumer(clerk);
    
        // 设置生产者和消费者的线程名称
        producer1.setName("生产者 1");
        producer2.setName("生产者 2");
        consumer1.setName("消费者 1");
        consumer2.setName("消费者 2");
    
        // 启动生产者和消费者线程
        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }
    
}

class Clerk {
    private int productCount = 0; // 产品数量
    private final int MAX_PRODUCT = 20; // 最大产品数量

    // 生产产品的方法
    public synchronized void produceProduct() {
        // 如果产品数量达到最大值，等待
        while (productCount >= MAX_PRODUCT) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 生产一个产品
        productCount++;
        System.out.println(Thread.currentThread().getName() + " 生产了一个产品。当前产品数量：" + productCount);
        // 通知所有等待的线程
        notifyAll();
    }

    // 消费产品的方法
    public synchronized void consumeProduct() {
        // 如果没有产品，等待
        while (productCount <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 消费一个产品
        productCount--;
        System.out.println(Thread.currentThread().getName() + " 消费了一个产品。当前产品数量：" + productCount);
        // 通知所有等待的线程
        notifyAll();
    }
}

class Producer extends Thread {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000); // 每隔1秒生产一个产品
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}

class Consumer extends Thread {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000); // 每隔1秒消费一个产品
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
}
