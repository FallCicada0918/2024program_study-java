/*
 * @Description: 单例模式的测试类
 * @Author: FallCicada
 * @Date: 2024-09-19 09:24:40
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-19 09:37:40
 */
public class Test {
     public static void main(String[] args) {
        //创建一个Student的实例
        Student s1 = Student.getStudent();
        System.out.println(s1);
        Student s2 = Student.getStudent();
        System.out.println(s2);
     }
}