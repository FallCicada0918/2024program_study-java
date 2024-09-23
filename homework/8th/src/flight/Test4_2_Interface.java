/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-22 17:54:09
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-22 17:56:41
 */
package flight;
 
public class Test4_2_Interface {
    public static void main(String[] args) {
        IFly bird = new Bird();
        bird.flyAction(); // 鸟会飞翔

        IFly plane = new Plane();
        plane.flyAction(); // 飞机能飞翔
    }
}