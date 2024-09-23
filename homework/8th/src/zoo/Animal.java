/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-21 17:49:16
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-21 17:49:20
 */
package zoo;
 
// 抽象类Animal
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public abstract void move();
}