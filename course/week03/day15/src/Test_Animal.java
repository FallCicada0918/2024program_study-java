/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-13 11:05:01
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-13 16:21:17
 */
public class Test_Animal {
    public static void main(String[] args) {
        Animal dog1=new Dog();
        dog1.setName("小黑");
        // dog1.setColor("黑色");
        dog1.setNumeber(1);
        dog1.sayHello();
        System.out.println("--------------------下面是继承的方法----------------------");
        Dog dog2=new Dog();
        dog2.setName("小黄");
        dog2.setColor("黄色");
        dog2.setNumeber(2);
        dog2.sayHello();
        System.out.println("toString()" + dog2.toString());
        dog2.showNumber();
        Dog dog3=new Dog("狗子2",10,"白色");
        dog3.sayHello();
    }
}