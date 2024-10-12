/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-12 15:41:12
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-12 15:46:05
 * @: 無限進步
 */
package day02;
/**
 * Productor
 */
public class Productor extends Thread{

    private Clark clark;

    public Productor(Clark clark){
        this.clark = clark;
    }

    @Override
    public void run(){
        System.out.println("生产者" + this.getName() + "生产了一个产品");
        while(true){
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                clark.Callproduct();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}