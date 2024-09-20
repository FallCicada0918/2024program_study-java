/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-20 11:03:53
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-20 11:07:52
 */
package animal;
//定义抽象父类
public abstract class Animal2 {
    private String color;
    private int age;
    public Animal2() {
    }
    public Animal2(String color, int age) {
    this.color = color;
    this.age = age;
    }
    // 抽象方法
    public abstract void eat();
    public abstract void sleep();
}