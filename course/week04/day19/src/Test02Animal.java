/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-20 09:16:01
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-20 10:08:37
 */
abstract class Animal {
    //抽象类中可以有成员属性,成员方法,构造器
    private String color;
    private int age;
    
    public Animal(){
        
    }
    
    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }
    // 抽象方法，用于定义动物的进食行为
    public abstract void eat();

    // 抽象方法，用于定义动物的睡眠行为
    public abstract void sleep();

    @Override
    public String toString(){
        return "这个动物的颜色是" + color + ",这个动物的年龄是:" + age;
    }
}
class Cat extends Animal {
    private String type;
    
    public Cat(){}
    
    public Cat(String color, int age, String type) {
        //第一行有效代码,调用父类构造器
        super(color, age);
        this.type = type;
    }
    //重写父类抽象方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫睡觉");
    }

    @Override
    public String toString() {
        String str = super.toString() + ",猫的品种:" + type ;
        return str;
    }
}

class Dog extends Animal {
    private String type;
    
    public Dog(){}
    
    public Dog(String color, int age, String type) {
        //第一行有效代码,调用父类构造器
        super(color, age);
        this.type = type;
    }
    //重写父类抽象方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫睡觉");
    }

    @Override
    public String toString() {
        String str = super.toString() + ",猫的品种:" + type ;
        return str;
    }
}

public class Test02Animal {
    public static void main(String[] args) {
        Animal cat = new Cat("black", 3, "英短");
        cat.eat();
        cat.sleep();
        System.out.println(cat.toString());
        Animal dog = new Dog("white", 4, "秋田犬");
    }
}