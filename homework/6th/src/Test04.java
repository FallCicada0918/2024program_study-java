/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-13 16:57:18
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-13 17:00:13
 */
// 定义一个人类
class Person {
    private String name; // 姓名

    public Person(String name) {
        this.name = name;
    }

    // 方法：让这个人开车
    public void drive(Car car, String destination) {
        System.out.println(name + " 开着 " + car.getModel() + " 去 " + destination);
    }
}

// 定义一个交通工具基类
class Vehicle {
    private String model; // 模型

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

// 定义一个汽车类，继承自交通工具基类
class Car extends Vehicle {
    public Car(String model) {
        super(model);
    }
}

public class Test04 {
    public static void main(String[] args) {
        // 创建一个叫张三的人
        Person zhangSan = new Person("阿臣");

        // 创建一辆汽车
        Car car = new Car("小米  su7");

        // 张三开着车去公司
        zhangSan.drive(car, "公司");
    }
}