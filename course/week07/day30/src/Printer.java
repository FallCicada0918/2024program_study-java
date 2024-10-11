/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-11 10:54:36
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-11 11:19:33
 * @: 無限進步
 */
/**
 * printer
 */
public class Printer {
    
    //创建一个普通(非静态)的同步方法
    //同步方法的锁对象是this
    public synchronized void print1() {
        System.out.print("天");
        System.out.print("天");
        System.out.print("向");
        System.out.print("上");
        System.out.println(" ");
    }
    //静态同步方法
    
    // Object mutex = new Object();
    //不同步的方法
    public void print2() {
        //同步代码块 - 要和
        synchronized (this) {
            System.out.print("好");
            System.out.print("好");
            System.out.print("学");
            System.out.print("习");
            System.out.println(" ");
        }
    }
    //静态同步方法 - 锁对象是printer.class
    public static synchronized void print3() {
        System.out.print("天");
        System.out.print("天");
        System.out.print("向");
        System.out.print("上");
        System.out.println(" ");
    }
    public void print4() {
        synchronized (Printer.class) {
            System.out.print("好");
            System.out.print("好");
            System.out.print("学");
            System.out.print("习");
            System.out.println(" ");
        }
    } 
}