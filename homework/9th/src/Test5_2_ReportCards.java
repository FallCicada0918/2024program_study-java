/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-27 22:25:52
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-27 22:31:16
 */
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test5_2_ReportCards {
    public static void main(String[] args) {
        // 定义Set集合并传入一个自定义比较规则的Comparator
        Set<Student> set = new TreeSet<>(new StudentComparator());

        // 测试数据
        Student student1 = new Student("tom", 80);
        Student student2 = new Student("mike", 90);
        Student student3 = new Student("lily", 20);
        Student student4 = new Student("chris", 23);

        set.add(student3);
        set.add(student2);
        set.add(student1);
        set.add(student4);

        // 输出结果
        for (Student student : set) {
            System.out.println(student);
        }
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", score=" + score + "]";
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // 名字为 "tom" 的学生优先
        if ("tom".equals(s1.getName())) {
            return -1;
        }
        if ("tom".equals(s2.getName())) {
            return 1;
        }
        
        // 其他学生按照成绩降序排序
        return Integer.compare(s2.getScore(), s1.getScore());
    }
}