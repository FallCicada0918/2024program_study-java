/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-10 15:22:56
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-10 15:26:28
 * @: 無限進步
 */
/**
 * IMyRunable
 */
public class IMyRunnable implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i = 0; i<10;i++){
            System.out.println("运行："+name + "run");
            try{
                Thread.sleep(1000);//让当前执行代码睡眠1000毫秒
            }catch(InterruptedException e){
                
                //为什么异常,没有抛出
                e.printStackTrace();
            }
        
        }   
    }  
}