/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-11 11:04:18
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-11 11:09:25
 * @: 無限進步
 */
/**
 * Test01_printer
 */
public class Test01_printer {
    //创建类的对象
    public static void main(String[] args) {
        // Printer printer = new Printer();
        // Thread t1 = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         for(int i = 0; i < 100; i++){
        //             printer.print1();
        //         }
        //     }
        // });
        
        //创建线程2
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    Printer.print3();
                }
            }
        });
        Printer printer = new Printer();
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    printer.print1();
                }
            }
        });
        //启动线程
        t3.start();
        t4.start();
    }
}