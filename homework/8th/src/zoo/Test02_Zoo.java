/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-21 15:40:13
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-21 17:50:42
 */

package zoo;

// 测试类
public class Test02_Zoo {
    public static void main(String[] args) {
        Animal cat = new Cat("Tom", "灰白");
        Animal dog = new Dog("旺财", 5);
        Animal bird = new Bird("樱桃", 21.76);

        cat.makeSound(); // 猫发出喵喵叫声
        cat.move();      // 猫在四腿爬行
        dog.makeSound(); // 狗发出汪汪叫声
        dog.move();      // 狗在四腿奔跑
        bird.makeSound(); // 鸟发出啾啾叫声
        bird.move();     // 鸟在飞翔
    }
}