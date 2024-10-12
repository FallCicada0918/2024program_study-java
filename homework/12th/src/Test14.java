/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-11 21:38:52
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-12 09:13:43
 * @: 無限進步
 */
/*
 * 有一个包子铺可以制作两种口味的包子，分别是肉馅和蔬菜馅。现在有一位包子铺师傅和三个顾客在排队等待买包子。要求：
 * 师傅可以无限制地制作包子；   
 * 每个顾客只能买到一个包子；
 * 如果某个口味的包子售完了，需要等到师傅再次制作出来才能继续售卖；
 * 如何实现师傅和顾客之间的同步和通信？请编写代码实现。
 * 
 */
// 定义一个类Test14来模拟包子铺的情景
public class Test14 {
    // 最大包子数量设置为1，意味着每次只能有一个包子在货架上  =>每个顾客只能买到一个包子；
    private static final int MAX_BAOZI = 1;
    // 当前肉包子的数量
    private int meatBaozi = 0;
    // 当前蔬菜包子的数量
    private int vegetableBaozi = 0;
    // 创建一个监视器对象用于同步
    private final Object monitor = new Object();

    // 主方法，程序的入口点
    public static void main(String[] args) {
        // 创建一个包子铺实例
        Test14 shop = new Test14();
        // 创建一个厨师线程
        Thread chef = new Thread(shop.new Chef());
        // 创建三个顾客线程，分别喜欢肉包子、蔬菜包子和肉包子
        Thread customer1 = new Thread(shop.new Customer("meat"));
        Thread customer2 = new Thread(shop.new Customer("vegetable"));
        Thread customer3 = new Thread(shop.new Customer("meat"));

        // 启动所有线程
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
                    // 使用监视器对象进行同步控制
                    synchronized (monitor) {
                        // 如果有任意一种包子的数量少于最大值，则可以制作新的包子
                        if (meatBaozi < MAX_BAOZI || vegetableBaozi < MAX_BAOZI) {
                            // 如果肉包子的数量少于最大值，则制作一个新的肉包子
                            if (meatBaozi < MAX_BAOZI) {
                                meatBaozi++;
                                System.out.println("厨师做了1个肉包子。");
                            }
                            // 如果蔬菜包子的数量少于最大值，则制作一个新的蔬菜包子
                            if (vegetableBaozi < MAX_BAOZI) {
                                vegetableBaozi++;
                                System.out.println("厨师做了1个蔬菜包子。");
                            }
                            // 通知所有等待的顾客，包子已经准备好
                            monitor.notifyAll(); // 通知所有等待的线程
                        }
                    }
                    // 模拟制作包子所需的时间
                    Thread.sleep(1000); // 模拟制作包子的时间
                }
            } catch (InterruptedException e) {
                // 线程被中断时，退出循环
                System.out.println("厨师线程被中断，停止制作包子。");
            }
        }
    }

    // 顾客的行为逻辑
    class Customer implements Runnable {
        // 记录顾客的偏好
        private final String preference;

        // 构造函数初始化顾客的偏好
        Customer(String preference) {
            this.preference = preference;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    // 使用监视器对象进行同步控制
                    synchronized (monitor) {
                        // 如果顾客偏好肉包子
                        if ("meat".equals(preference)) {
                            // 如果没有肉包子，则等待
                            while (meatBaozi == 0) {
                                monitor.wait(); // 等待通知
                            }
                            // 减少肉包子的数量
                            meatBaozi--;
                            // 输出顾客买了肉包子的信息
                            System.out.println(Thread.currentThread().getName() + " 购买了1个肉包子。");
                        } else if ("vegetable".equals(preference)) {
                            // 如果没有蔬菜包子，则等待
                            while (vegetableBaozi == 0) {
                                monitor.wait(); // 等待通知
                            }
                            // 减少蔬菜包子的数量
                            vegetableBaozi--;
                            // 输出顾客买了蔬菜包子的信息
                            System.out.println(Thread.currentThread().getName() + " 购买了1个蔬菜包子。");
                        }
                    }
                }
            } catch (InterruptedException e) {
                // 如果线程被中断，恢复中断状态
                Thread.currentThread().interrupt();
            }
        }
    }
}