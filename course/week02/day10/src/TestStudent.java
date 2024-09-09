/*
 * @Description: 学生的测试类
 * @Author: FallCicada
 * @Date: 2024-09-06 09:25:17
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-06 09:34:22
 */
public class TestStudent{
    public static void main(String[] args) {
        //创建一个学生对象
        //数据类型 变量名 = （初始化）new 数据类型();
        Student stu = new Student();
        stu.name = "穆仁";
        stu.age = 21;
        stu.sex = '男';
        stu.address = "乌兰察布";
        stu.num = 42;
        stu.sayName();
        stu.setHello();
        System.out.println("student的住址"+stu.address);
        System.out.println("student的年龄"+stu.age);
        System.out.println("student的姓名"+stu.name);
        System.out.println("student的学号"+stu.num);
        System.out.println("student的性别" + stu.sex);


    }
}