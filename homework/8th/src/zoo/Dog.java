/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-21 17:50:48
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-21 17:50:52
 */
package zoo;
 
// 狗类
public class Dog extends Animal {
    private int age;

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println("汪汪");
    }

    @Override
    public void move() {
        System.out.println("狗在四腿奔跑");
    }
}