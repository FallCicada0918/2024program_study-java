/*
 * @Description: 实现Runable接口
 * @Author: FallCicada
 * @Date: 2024-10-10 15:21:19
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-11 11:02:31
 */
/**
 * ITicketRunable
 */
public class ITicketRunnable implements Runnable {
    // 总票数 50
    private int num = 50;
    //新建锁对象给同步代码块使用
    Object mutex = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (mutex) {
                //TODO 同步代码块
                // 1. 线程抢占资源，上锁
                //  进入代码块执行
                // 2. 其他线程抢不到资源，陷入阻塞状态
                // 3. 第一步的线程执行结束，释放资源，解锁
                // 4. 三个线程抢占资源，重新上锁 
                //需要同步的代码
                if (num <= 0) {
                    break;
                }

                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖票，第" + num + "张票。");
                // 每隔50ms销售一张票
                num--;
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //线程执行完同步代码后，会自动释放锁 - 解锁
                //需要同步的内容结束 - 结束
                //或者 break return 也会离开代码块
            }
        }
    }
}
