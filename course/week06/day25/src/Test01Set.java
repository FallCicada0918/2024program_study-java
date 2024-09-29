/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-29 08:36:52
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-29 18:03:40
 */
/**
 * Test01
 */
import java.util.Iterator;
import  java.util.Set;

public class Test01Set {

    public static void main(String[] args) {
        //实例化一个set集合
        Set<String> set = new java.util.HashSet<>();
        //存放元素
        set.add("hello1");
        set.add("hello2");
        set.add("hello3");
        set.add("hello4");
        set.add("hello5");
        set.add("hello5");
        set.add(null);
        set.add(null);
        System.out.println(set.size());
        System.out.println(set);
        for (String string : set) {
            System.out.println(string + "\t");
        }
        System.out.println("\t");
        //迭代器遍历
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
        //实例化一个set集合用于存放Student数据
        Set<Student> setStudent = new java.util.HashSet<>();
        setStudent.add(new Student("student", 20));
        setStudent.add(new Student("student", 20));
        setStudent.add(new Student("student", 20));
        setStudent.add(new Student("student", 20));
        System.out.println(setStudent.size());// 4
        //哈希set认为这四个值是不同的
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        System.out.println("stu1.hashCode:" + stu1.hashCode());
        System.out.println("stu2.hashCode:" + stu2.hashCode());
        System.out.println("stu3.hashCode:" + stu3.hashCode());
        System.out.println(setStudent);
    }

}