/*
 * @Description: 匿名内部类实现接口
 * @Author: FallCicada
 * @Date: 2024-09-24 08:45:31
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-24 09:05:45
 */
public class Test01 {
    public static void main(String[] args) {
        //通过匿名内部类来实现接口
        ISleep sleep = new ISleep() {
            @Override
            public void sleep() {
                System.out.println("ISleep sleep");
            }
        };
        sleep.sleep();
        //简化的写法
        ISleep sleep2 = () -> System.out.println("ISleep sleep2");
        sleep2.sleep();
        //通过匿名内部类去实现抽象类
        MyClass myClass = new MyClass() {
            @Override
            public void run() {
                System.out.println("MyClass run");
            }
        };
        myClass.run();
        // myClass.test();
        new MyClass() {
            @Override
            public void run() {
                System.out.println("简化的：MyClass run");
            }
        }.run();
    }
}