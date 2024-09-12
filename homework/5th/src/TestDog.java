/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-10 19:44:03
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-11 14:52:41
 */
class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println(name + " 在随风奔跑");
    }
}
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("小黑");
        Dog d2 = new Dog("虎子");
        
        d1.run();
        d2.run();
        System.out.println(d1);
        System.out.println(d2);
    }
}