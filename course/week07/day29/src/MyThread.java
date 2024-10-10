/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-10 14:34:27
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-10 14:45:32
 * @: 無限進步
 */

/**
 * MyThread
 * 线程属于long包不需要导包
 */
public class MyThread extends Thread {

    public static void main(String[] args) {
        Thread myThread = new MyThread();
        //启动线程
        myThread.start();
    }
    @Override
    public void run(){
        for(int i = 0; i<10;i++){
            System.out.println("Thread,run");
            try{
                Thread.sleep(1000);//让当前执行代码睡眠1000毫秒
            }catch(InterruptedException e){
                //线程执行中断 会抛出这个异常
                //sleep wait 等
                e.printStackTrace();
            }
        }
    }
}