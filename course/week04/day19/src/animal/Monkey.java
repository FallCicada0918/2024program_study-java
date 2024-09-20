/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-20 11:03:53
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-20 11:11:08
 */
package animal;

public class Monkey extends Animal2 implements ICycleAble, IJumpAble{
    public String name;
    public Monkey() {}
    public Monkey(String color, int age, String name) {
        super(color, age);
        this.name = name;
    }
    //重写从父类继承的方法
    @Override
    public void eat() {
        System.out.println("猴子" + name + " 喜歡吃香蕉");
    }
    @Override
    public void sleep() {
        System.out.println("猴子" + name + " 喜歡咬觀衆");
    }
    // 重写从接口获取的抽象方法
    @Override
    public void cycle() {
        System.out.println("猴子" + name + " 能夠騎自行車");
    }
    @Override
    public void jump() {
        System.out.println(name + " 能夠跳火圈 ");
    }
}
