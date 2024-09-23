/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-21 17:50:13
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-21 17:56:34
 */
package zoo;

// 猫类
public class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("喵喵");
    }

    @Override
    public void move() {
        System.out.println("猫在四腿爬行");
    }
}