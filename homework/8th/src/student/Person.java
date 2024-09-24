/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-23 19:33:21
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-23 19:33:21
 */
package student;
// 定义 Person 类
public class Person {
    String name;
    int age;

    // 构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 行为：run
    public void run() {
        System.out.println(name + " is running.");
    }
}