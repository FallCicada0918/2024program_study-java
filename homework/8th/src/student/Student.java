/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-23 19:37:51
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-23 19:37:55
 */
package student;
// 定义 Student 类继承自 Person 类
public class Student extends Person implements ISingAble, IFlyAble {
    String id;
    double score;

    // 构造方法
    public Student(String name, int age, String id, double score) {
        super(name, age);  // 调用父类构造器
        this.id = id;
        this.score = score;
    }

    // 行为：study
    public void study() {
        System.out.println(super.name + " is studying hard.");
    }

    // 实现 ISingAble 接口中定义的方法
    @Override
    public void sing() {
        System.out.println(super.name + " is singing a song.");
    }

    // 实现 IFlyAble 接口中定义的方法
    @Override
    public void fly() {
        System.out.println(super.name + " is flying.");
    }
}