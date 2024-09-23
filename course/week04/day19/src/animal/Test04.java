/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-20 11:03:06
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-20 15:35:17
 */
package animal;

public class Test04 {
     public static void main(String[] args) {
           // 1. 抽象类不能实例化对象 但是可以定义引用指向子类对象
    Animal2 animalMonkey = new Monkey("yellow", 2, "悟空");
    animalMonkey.eat();
    animalMonkey.sleep();
    // 多态 编译看左边 运行看右边
    // animalMonkey.jump();
    // animalMonkey.cycle();
    // 接口的引用指向实现类的对象
    ICycleAble iCycleAble = new Monkey("yellow", 2, "悟空");
    iCycleAble.cycle();
    // 多态 编译看左边 运行看右边
    // iCycleAble.eat();
    // iCycleAble.sleep();
    // iCycleAble.jump();
    // 如果想要调用父类的方法 可以借助类型转换实现
    Monkey m = (Monkey) iCycleAble;
    m.eat();
    m.sleep();
    m.jump();
          
     }
}