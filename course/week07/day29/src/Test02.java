/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-10 14:54:53
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-10 15:07:03
 * @: 無限進步
 */
/**
 * Test02
 */
public class Test02 {

    public static void main(String[] args) {
        //通过匿名内部类创建子线程
        Thread t = new Thread(){
            @Override
            public void run(){
                for(int i = 0; i<10;i++){
                    System.out.println("Thread,run");
                    try{
                        Thread.sleep(1000);//让当前执行代码睡眠1000毫秒
                    }catch(InterruptedException e){
                        
                        //为什么异常,没有抛出
                        e.printStackTrace();
                    }
                }     
            }
        };
        t.start();
        System.out.println(t.toString());
        String name = t.getName();
        System.out.println("名字:" + name);
    }
}