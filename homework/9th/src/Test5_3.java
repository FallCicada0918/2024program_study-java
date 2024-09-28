/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-28 17:52:28
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-28 17:56:50
 */

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 通过两种⽅式实现：Comparable接⼝和Comparator接⼝
 *【要求】
 * 设计Teacher类，包含属性id，name,age，创建Teacher对象。
 * 将对象保存在TreeSet集合中并且排序。
 * 排序规则为：先通过名字排序，名字相同的时候通过年龄进⾏排序，年龄相同时通过id排序。
 */
public class Test5_3 {
    public static void main(String[] args) {
        TreeSet<Teacher> treeSet = new TreeSet<>(new TeacherComparator());

        Teacher t1 = new Teacher("tom", 23, 1);
        
        Teacher t2 = new Teacher("lily", 24, 2);
        Teacher t3 = new Teacher("mike", 23, 3);
        
        Teacher t4 = new Teacher("lily", 24, 4);
        
        treeSet.add(t4);
        treeSet.add(t1);
        treeSet.add(t2);
        treeSet.add(t3);

        
    }
    
}
class Teacher implements Comparable<Teacher>{
    private String name;
    private int age;
    private int id;

    public Teacher(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Teacher o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
}
class TeacherComparator implements Comparator<Teacher>{

    @Override
    public int compare(Teacher t1, Teacher t2) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}