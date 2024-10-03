/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-29 17:53:11
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-10-02 19:38:50
 */


/**
 * 学生类，实现了Comparable接口，用于比较学生对象的顺序。
 * 比较主要基于姓名的升序排列。如果姓名相同，则基于年龄的降序排列。
 *
 * @param name 学生的姓名。
 * @param age 学生的年龄。
 *
 * @constructor
 * - Student()：默认构造函数。
 * - Student(String name, int age)：带参数的构造函数，初始化学生的姓名和年龄。
 *
 * @method
 * - int getAge()：获取学生的年龄。
 * - String getName()：获取学生的姓名。
 * - String toString()：重写的toString方法，返回学生对象的字符串表示形式。
 * - int compareTo(Student o)：重写的compareTo方法，用于比较两个学生对象的顺序。
 *   - 如果当前学生的姓名按字典顺序小于指定学生的姓名，或者姓名相同但当前学生的年龄大于指定学生的年龄，则返回负整数。
 *   - 如果姓名和年龄都相同，则返回零。
 *   - 如果当前学生的姓名按字典顺序大于指定学生的姓名，或者姓名相同但当前学生的年龄小于指定学生的年龄，则返回正整数。
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
    int result = this.name.compareTo(o.name);
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