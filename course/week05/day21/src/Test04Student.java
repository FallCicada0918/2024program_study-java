/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-24 15:24:15
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-24 15:51:02
 */
public class Test04Student {
    public static void main(String[] args) {
        Student student1 = new Student("student", 18);
        Student student2 = new Student("student", 18);
        student1 = student2;
        //比较的是对象的引用，student1 和 student2是分别创建的，所以引用地址不同
        System.out.println("Student1 == Student2:" + (student1 == student2));
        System.out.println("Student1.equals(Student2):" + student1.equals(student2));
        System.out.println(student1.equals(student2));
    }
}