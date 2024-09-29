/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-29 17:53:11
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-29 18:01:28
 */


public class Student implements Comparable<Student>
// implements Comparable<Student>
{
  private String name;
  private int age;

  public Student() {
  }

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  // 重写toSting方法
  @Override 
  public String toString() {
    return "Stu{name:" + name + ",age:" + age + "}";
  }

  // 重写排序接口的方法 - 自然排序
  @Override
  public int compareTo(Student o) {
    // 先按照name去升序 name相同再排age age降序
    int result = 0;/*this.name.compareTo(o.name);*/
    if (result == 0) {
      // result 值如果大于 0 那么 this比o大
      // result 值如果小于 0 那么 this比o小
      // result 值如果等于 0
      result = o.age - this.age;
    }
    return result;
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