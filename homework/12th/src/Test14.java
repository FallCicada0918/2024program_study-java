import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-11 21:38:52
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-11 21:40:07
 * @: 無限進步
 */
public class Test14 {
    private static final int MAX_BAOZI = 1;
    private int meatBaozi = 0;
    private int vegetableBaozi = 0;
    private final Lock lock = new ReentrantLock();
    private final Condition meatCondition = lock.newCondition();
    private final Condition vegetableCondition = lock.newCondition();

    public static void main(String[] args) {
        Test14 shop = new Test14();
        Thread chef = new Thread(shop.new Chef());
        Thread customer1 = new Thread(shop.new Customer("meat"));
        Thread customer2 = new Thread(shop.new Customer("vegetable"));
        Thread customer3 = new Thread(shop.new Customer("meat"));

        chef.start();
        customer1.start();
        customer2.start();
        customer3.start();
    }

    class Chef implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    lock.lock();
                    try {
                        if (meatBaozi < MAX_BAOZI) {
                            meatBaozi++;
                            System.out.println("Chef made a meat baozi.");
                            meatCondition.signal();
                        }
                        if (vegetableBaozi < MAX_BAOZI) {
                            vegetableBaozi++;
                            System.out.println("Chef made a vegetable baozi.");
                            vegetableCondition.signal();
                        }
                    } finally {
                        lock.unlock();
                    }
                    Thread.sleep(1000); // Simulate time taken to make baozi
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    class Customer implements Runnable {
        private final String preference;

        Customer(String preference) {
            this.preference = preference;
        }

        @Override
        public void run() {
            try {
                lock.lock();
                try {
                    if ("meat".equals(preference)) {
                        while (meatBaozi == 0) {
                            meatCondition.await();
                        }
                        meatBaozi--;
                        System.out.println(Thread.currentThread().getName() + " bought a meat baozi.");
                    } else if ("vegetable".equals(preference)) {
                        while (vegetableBaozi == 0) {
                            vegetableCondition.await();
                        }
                        vegetableBaozi--;
                        System.out.println(Thread.currentThread().getName() + " bought a vegetable baozi.");
                    }
                } finally {
                    lock.unlock();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}