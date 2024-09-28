/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-27 16:59:06
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-27 16:59:13
 */


import java.util.Collection;
import java.util.ArrayList;

/**
 * Test03Student
 */
public class Test03Student {

  public static void main(String[] args) {
    // 创建多个学生对象 - 注意 s1 和 s5 属性相同
    Student s1 = new Student("s1", 20);
    Student s2 = new Student("s2", 18);
    Student s3 = new Student("s3", 19);
    Student s4 = new Student("s4", 21);
    Student s5 = new Student("s1", 20);
    // 创建一个学生类的集合
    Collection<Student> coll = new ArrayList<Student>();
    // 给集合添加元素
    coll.add(s1);
    coll.add(s2);
    coll.add(s3);
    coll.add(s4);
    coll.add(s5);
    System.out.println(coll);
    System.out.println(coll.size());
    // 判断元素是否存在
    System.out.println(coll.contains(s1)); // true
    // 移除指定元素
    System.out.println(coll.remove(s5));// ?
    System.out.println(coll);
    System.out.println(coll.size());
  }
}
class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
      this.name = name;
      this.age = age;
    }

    // 重写toSting方法
    @Override
    public String toString() {
      return "Stu{name:" + name + ",age:" + age + "}";
    }

    // 重写equals方法
    // @Override
    // public boolean equals(Object obj) {
    // if (this == obj)
    // return true;
    // if (obj == null)
    // return false;
    // if (getClass() != obj.getClass())
    // return false;
    // Student other = (Student) obj;
    // if (age != other.age)
    // return false;
    // if (name == null) {
    // if (other.name != null)
    // return false;
    // } else if (!name.equals(other.name))
    // return false;
    // return true;
    // }
}