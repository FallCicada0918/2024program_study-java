/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-10-11 15:04:25
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-11 15:42:04
 * @: 無限進步
 */

package DoubleBaoZi;
/**
 * Test02BaoZi
 */
public class Test02BaoZi {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();

        Thread p = new Producer(bz, "生产者");
        Thread c = new Customer1(bz, "消费者");
        Thread c1 = new Customer2(bz, "消费者2");

        p.start();
        // Twce(c, c1);
        c.start();
        c1.start();
    }
    // public static void Twce(Thread c,Thread c1){
    //     c.start();
    //     c1.start();
    // }
}
