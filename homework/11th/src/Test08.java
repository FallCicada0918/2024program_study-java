/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-10 17:30:18
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-10 17:33:14
 * @: 無限進步
 */
public class Test08 {
    public static void main(String[] args) { 
        Thread t = new Thread() {
            public void run() {
                String name = Thread.currentThread().getName(); 
                System.out.println(name);
            }
        };
        t.start();
        t.run();
    }
}
    