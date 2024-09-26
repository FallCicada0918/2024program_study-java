/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-26 11:30:39
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-26 11:42:06
 */
/**
 * 定义一个学生类，创建多个对象，放到集合中add，测试contains、remove等方法
 */
import java.util.ArrayList;
import java.util.Collection;
public class Test03Collection {
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<>();
        Student z3 = new Student("张三", 18);
        Student l4 = new Student("李四", 19);
        Student w5 = new Student("王五", 20);
        coll.add(z3);
        coll.add(l4);
        coll.add(w5);
        System.out.println(coll);
        System.out.println(coll.size());
        System.out.println(coll.contains(z3));
        System.out.println(coll.remove(z3));
        System.out.println(coll);
    }
}
/*
 * Student
 */
class Student {
    String name;
    int age;
    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
}