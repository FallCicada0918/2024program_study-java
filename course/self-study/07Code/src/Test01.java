/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-19 16:58:29
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-19 17:02:37
 */
class Animal {
    public void eat() {
        System.out.println("吃");
    }
    public void sleep(){
        System.out.println("睡");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃肉");
    }

    @Override
    public void sleep(){
        System.out.println("趴着睡");
    }
}
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep(){
        System.out.println("躺着睡");
    }
}
public class Test01 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();
        System.out.println("-------------------------");
        
        Dog d = new Dog();
        d.eat();
        d.sleep();
        System.out.println("-------------------------");
        Cat c = new Cat();
        c.eat();
        c.sleep();
        System.out.println("-------------------------");
    }
}