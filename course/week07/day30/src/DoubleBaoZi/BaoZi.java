package DoubleBaoZi;
/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-11 14:40:00
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-11 14:40:06
 * @: 無限進步
 */

/**
 * BaoZi
 */
public class BaoZi {
    public int num;
    
    // public boolean flag = false;
    
    //三个线程 - 三个状态
    //0 - 生产者生产包子
    //1 - 消费者消费包子
    //2 - 消费者1消费包子
    int flag = 0;
    
}