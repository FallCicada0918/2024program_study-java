package staudent;

/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-11 19:06:01
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-11 19:12:19
 */
import java.util.Scanner;

// 学生管理系统类
public class StudentManagement {
    // 学生对象数组
    private Student[] stus;
    // 实际学生个数
    private int counter;
    // 键盘录入对象
    private Scanner in;

    // 无参构造器：默认容量100
    public StudentManagement() {
        stus = new Student[100];
        in = new Scanner(System.in);
    }

    // 有参构造器：size表示初始容量
    public StudentManagement(int size) {
        stus = new Student[size];
        in = new Scanner(System.in);
    }

    // 输出 操作提示
    public void prompt() {
        System.out.println("********************");
        System.out.println("*Student Management*");
        System.out.println("********************");
        System.out.println("* 1)Add");
        System.out.println("* 2)Delete");
        System.out.println("* 3)Update");
        System.out.println("* 4)Select");
        System.out.println("* 0)Quit");
        System.out.println("********************");
        System.out.print("Please choose your operate:");
    }

    // 根据用户录入的学生名称，找到学生在数组中的索引返回
    private int findStudent() {
        int index = -1;
        String name;
        System.out.print("Please input name:");
        // 从键盘获取一个字符串
        name = in.next();
        for (int i = 0; i < counter; i++) {
            if (stus[i].getName().equals(name)) {
                index = i;
                break;
            }
        }
        return index;
    }

    // 增加学生
    public void addStudent() {
        String name;
        int age;
        String gender;
        Student s;
        // 判断 管理系统容量是否已满
        if (counter >= stus.length) {
            System.out.println("Add failure, too many students!");
            return;
        }
        System.out.print("Please input name:");
        name = in.next();
        System.out.print("Please input age:");
        age = in.nextInt();
        System.out.print("Please input gender:");
        gender = in.next();
        s = new Student(name, age, gender);
        // 关键代码
        stus[counter] = s;
        counter++;
        System.out.println("Add student success!");
    }

    // 删除学生
    public void deleteStudent() {
        int index = findStudent();
        if (index == -1) {
            System.out.println("Student not found!");
            return;
        }
        for (int i = index; i < counter - 1; i++) {
            stus[i] = stus[i + 1];
        }
        stus[--counter] = null;
        System.out.println("Delete student success!");
    }

    // 更新学生信息
    public void updateStudent() {
        int index = findStudent();
        if (index == -1) {
            System.out.println("Student not found!");
            return;
        }
        System.out.print("Please input new name:");
        String newName = in.next();
        System.out.print("Please input new age:");
        int newAge = in.nextInt();
        System.out.print("Please input new gender:");
        String newGender = in.next();
        stus[index].setName(newName);
        stus[index].setAge(newAge);
        stus[index].setGender(newGender);
        System.out.println("Update student success!");
    }

    // 查询学生信息
    public void selectStudent() {
        int index = findStudent();
        if (index == -1) {
            System.out.println("Student not found!");
            return;
        }
        System.out.println("Name: " + stus[index].getName());
        System.out.println("Age: " + stus[index].getAge());
        System.out.println("Gender: " + stus[index].getGender());
    }

    public static void main(String[] args) {
        // 实例化对象
        StudentManagement sm = new StudentManagement();
        // 用户操作标志
        int option = -1;
        Loop: while (true) {
            // 打印提示信息
            sm.prompt();
            // 获取用户操作
            option = sm.in.nextInt();
            if (option < 0 || option > 4)
                continue;
            switch (option) { // byte char short int
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.deleteStudent();
                    break;
                case 3:
                    sm.updateStudent();
                    break;
                case 4:
                    sm.selectStudent();
                    break;
                case 0:
                    break Loop;
            } // end switch
        } // end while
        System.out.println("Game over, byebye");
    } // end main
}

class Student {
    // 属性
    private String name;
    private int age;
    private String gender;

    // 默认|无参构造器
    public Student() {}

    // 有参构造器
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // getter/setter 方法
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}