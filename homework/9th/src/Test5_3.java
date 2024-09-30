/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-28 17:52:28
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-29 19:53:06
 */

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 通过两种方式实现：Comparable接口和Comparator接口
 */
public class Test5_3 {
    public static void main(String[] args) {
        // 使用自定义的Comparator进行排序
        TreeSet<Teacher> treeSet = new TreeSet<>(new TeacherComparator());

        Teacher t1 = new Teacher("tom", 23, 1);
        Teacher t2 = new Teacher("lily", 24, 2);
        Teacher t3 = new Teacher("mike", 23, 3);
        Teacher t4 = new Teacher("lily", 24, 4);

        treeSet.add(t4);
        treeSet.add(t1);
        treeSet.add(t2);
        treeSet.add(t3);
        System.out.println(treeSet);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher [name=" + name + ", age=" + age + ", id=" + id + "]";
    }

    @Override
    public int compareTo(Teacher o) {
        int result = this.name.compareTo(o.getName());
        if (result == 0) {
            result = Integer.compare(this.age, o.getAge());
            if (result == 0) {
                result = Integer.compare(this.id, o.getId());
            }
        }
        return result;
    }
}

class TeacherComparator implements Comparator<Teacher>{

    @Override
    public int compare(Teacher t1, Teacher t2) {
        int result = t1.getName().compareTo(t2.getName());
        if (result == 0) {
            result = Integer.compare(t1.getAge(), t2.getAge());
            if (result == 0) {
                result = Integer.compare(t1.getId(), t2.getId());
            }
        }
        return result;
    }
}