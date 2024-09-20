/*
 * @Description: 抽象类
 * @Author: FallCicada
 * @Date: 2024-09-20 08:41:03
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-20 09:52:50
 */
abstract class Animal {
    // 抽象方法，用于定义动物的进食行为
    public abstract void eat();

    // 抽象方法，用于定义动物的睡眠行为
    public abstract void sleep();
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("躺着睡");
    }
}

abstract class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void sleep() {
        System.out.println("趴着睡");
    }
}

public class Test01Animal {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();
        cat.sleep();

        // Animal dog = new Dog();
        // dog.eat();
        // dog.sleep();
    }
}