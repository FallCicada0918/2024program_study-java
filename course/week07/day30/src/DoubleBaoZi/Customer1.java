package DoubleBaoZi;
/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-11 14:40:00
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-11 16:16:52
 * @: 無限進步
 */
/*
 * Customer
 */
public class Customer1 extends Thread {

    private BaoZi bum;
    private String name;
 
    public Customer1( BaoZi bum,String name) {
        this.name = name;
        this.bum = bum;
    }
 
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            // 同步
            synchronized (bum) {
                // 根据flag判断包子是否存在，如果不存在则线程等待
                // 注意，此处必须改为while，用if无法实现功能
                while (bum.flag != 1) {
                    try {
                        bum.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
 
                System.out.println(this.name + " 开始吃包子...");
                bum.num--;
                System.out.println("消费完成，包子剩余数量: " + bum.num);
                // 消费完成，修改flag存在标识为false
                bum.flag = 2;

                // 通知 其他所有线程转入运行
                bum.notifyAll();
            }
        }
    }
}