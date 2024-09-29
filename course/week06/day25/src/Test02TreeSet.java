/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-29 09:43:20
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-29 17:19:51
 */

 import java.util.Comparator;
 import java.util.Set;
 import java.util.TreeSet;
 
 /**
  * Test02TreeSet
  */
 public class Test02TreeSet {
 
   public static void main(String[] args) {
     // 实例化一个集合对象
     Set<Integer> set = new TreeSet<>();
     // 添加元素
     set.add(3);
     set.add(5);
     set.add(1);
     set.add(2);
     set.add(7);
     // 遍历输出
     for (Integer integer : set) {
       System.out.println(integer);
     }
     // 实例化一个集合对象
     Set<Student> setStudent = new TreeSet<>();
     // 没有实现相关自然排序接口 所以这里会报错
     setStudent.add(new Student("Student1", 18));
     setStudent.add(new Student("Student1", 17));
     setStudent.add(new Student("Student1", 20));
     setStudent.add(new Student("Student3", 18));
     setStudent.add(new Student("Student2", 17));
     setStudent.add(new Student("Student0", 20));
     // // 遍历输出
     for (Student s : setStudent) {
       System.out.println(s);
     }
 
     // 1. 自定义比较器实现比较规则
     // 注意：源码中的重写的方法要注释掉
     // 注意：源码中的实现的接口要注释掉
     // 准备自定义比较器对象
     Comparator<Student> comp = new Comparator<Student>() {
       // 匿名内部类
       // 重写比较的算法
       @Override
       public int compare(Student o1, Student o2) {
         int result = 0;
         // 比较规则：先按age 升序 再按name 降序
         result = o1.getAge() - o2.getAge();
         if (result == 0) {
           result = o2.getName().compareTo(o1.getName());
         }
         return result;
       }
     };
     // 2. 实例化一个 TreeSet 传入自定义比较器
     Set<Student> studentSet = new TreeSet<>(comp);
     studentSet.add(new Student("Student", 21));
     studentSet.add(new Student("Student", 18));
     studentSet.add(new Student("Student", 20));
     studentSet.add(new Student("Student", 19));
     studentSet.add(new Student("Student", 21));
     studentSet.add(new Student("Student1", 21));
     studentSet.add(new Student("Student2", 21));
     studentSet.add(new Student("Student3", 21));
     // 遍历集合
     for (Student student : studentSet) {
       System.out.println(student);
     }
   }
 }
