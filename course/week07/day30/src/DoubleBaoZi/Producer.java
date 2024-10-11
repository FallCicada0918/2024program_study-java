package DoubleBaoZi;
/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-11 14:38:56
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-11 15:49:01
 * @: 無限進步
 */


/**
 * prodocer
 */
public class Producer extends Thread{
    private BaoZi bum;
 
    public Producer(BaoZi bum,String name ) {
        super(name);
        this.bum = bum;
    }
 
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            // 同步
            synchronized (bum) {
                // 根据flag判断包子是否存在，如果存在则 线程进行等待
                // 注意，此处必须改为while，用if无法实现功能
                while (bum.flag != 0) {
                    try {
                        bum.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
 
                // 生产包子
                System.out.println("第" + i + "次，" + this.getName() + ": 开始生产包子...");
                // 每次生产2个包子
                bum.num += 2;
                System.out.println("生产完成，包子数量: " + bum.num + "，快来吃!");
 
                // 生产完成，修改flag存在标识为true
                bum.flag = 1;
 
                // 通知 其他所有线程转入运行
                bum.notifyAll();
            }
        }
    }
                
}