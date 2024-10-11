/*
 * @Description:
 * @Author: FallCicada
 * @Date: 2024-10-10 15:21:19
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-11 10:23:08
 */
/**
 * Test07
 */
public class Test07 {

    public static void main(String[] args) {
        ITicketRunnable t = new ITicketRunnable();
        // 创建售票窗口
        Thread t1 = new Thread(t, "售票口1");
        Thread t2 = new Thread(t, "售票口2");
        Thread t3 = new Thread(t, "售票口3");

        t1.start();
        t2.start();
        t3.start();
    }
}