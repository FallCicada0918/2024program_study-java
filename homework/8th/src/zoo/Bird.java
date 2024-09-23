/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-21 17:51:27
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-21 17:51:31
 */
package zoo;

// 鸟类
public class Bird extends Animal {
    private double wingspan;

    public Bird(String name, double wingspan) {
        super(name);
        this.wingspan = wingspan;
    }

    @Override
    public void makeSound() {
        System.out.println("啾啾");
    }

    @Override
    public void move() {
        System.out.println("鸟在飞翔");
    }
}
