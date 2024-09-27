/*
 * @Description: 
 * @Author: rendc
 * @Date: 2024-09-27 08:33:53
 * @LastEditors: rendc
 * @LastEditTime: 2024-09-27 08:50:22
 */
/**
 * Student
 */
public class Student {
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