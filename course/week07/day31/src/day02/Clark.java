/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-12 15:26:57
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-12 15:40:51
 * @: 無限進步
 */
package day02;
/**
 * Clark
 */
public class Clark {

    //产品数量
    private int productCount = 0;
    
    private int maxCount = 20;

    //联系生产者
    public synchronized void Callproduct() throws InterruptedException {
        if (productCount > maxCount) {
            System.out.println("生产者等待");
            try{
                this.wait();
                System.out.println("生产者停止生产");
            }catch(InterruptedException e){
                e.printStackTrace();
            }            
        } else {
            productCount++;
            System.out.println("生产者"+Thread.currentThread().getName()+"生产了一个产品，当前产品数量：" + productCount);
            notifyAll();
        }
        // productCount++;
        // System.out.println("生产者生产了一个产品，当前产品数量：" + productCount);
        // notifyAll();
    }
    //联系消费者
    public synchronized void Callconsume() throws InterruptedException {
        if (productCount > 0) {
            productCount--;
            System.out.println("消费者" + Thread.currentThread().getName() + "消费了一个产品，当前产品数量：" + productCount);
            notifyAll();
        }else{
            System.out.println("消费者等待");
            wait();
        }
    }
}