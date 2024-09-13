/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-13 09:25:10
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-13 09:54:24
 */
public class Test_Extends {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setId(1);
        stu.setName("FallCicada");
        stu.sayHello();
        Student stu1 = new Student();
        stu1.setId(2);
        //从父类继承来的方法
        stu1.setName("LitteYear");
        stu1.sayHello(); 
    }
}