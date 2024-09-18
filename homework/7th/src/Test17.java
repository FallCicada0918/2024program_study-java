/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-18 19:30:11
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-18 20:13:18
 */
class Animal {
    public void speak() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("I am a dog.");
    }
    public void wagTail() {
        System.out.println("I am wagging my tail.");
    }
}
public class Test17 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.speak();
        // 强制类型转换
        if (a instanceof Dog) {
            Dog dog = (Dog) a;
            dog.wagTail(); // 输出 "I am wagging my tail."
        }
    }
}
