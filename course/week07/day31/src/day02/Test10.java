/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-12 15:26:08
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-12 15:49:58
 * @: 無限進步
 */
package day02;
/** 
 * Test10
 */
public class Test10 {

    public static void main(String[] args) {
        //创建对象
        Clark clark = new Clark();
        Productor productor = new Productor(clark);
        Productor productor2 = new Productor(clark);
        // Consumer consumer = new Consumer(clark);
    }
}
