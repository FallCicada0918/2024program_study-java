/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-24 09:19:50
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-24 09:30:57
 */
public class Test02 {
    public static void main(String[] args) {
        //实例化匿名内部类对象
        Animal animal = new Animal("狗子") {
            @Override
            public void eat() {
                //匿名内部类等于子类，所以可以使用super访问父类的方法和成员
                System.out.println("Animal eat" + super.getName());
            }
            @Override
            public void sleep() {
                System.out.println("Animal sleep" + super.getName());
            }
        };
        animal.eat();
        animal.sleep();
    }
}