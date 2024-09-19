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
        // 初始化索引值为-1，表示尚未找到学生
        int index = -1;
        // 声明一个变量用于存储用户输入的名字
        String name;
        // 提示用户输入学生姓名
        System.out.print("Please input name:");
        // 从键盘获取一个字符串
        name = in.next();
        // 遍历已有的学生数组
        for (int i = 0; i < counter; i++) {
            // 如果当前学生的名字与用户输入的名字匹配
            if (stus[i].getName().equals(name)) {
                // 更新索引值为找到的学生在数组中的位置
                index = i;
                // 找到学生后立即退出循环
                break;
            }
        }
        // 返回学生的索引值，如果未找到则返回-1
        return index;
    }

    // 增加学生
    public void addStudent() {
        // 定义局部变量
        String name;
        int age;
        String gender;
        Student s;
        // 判断管理系统容量是否已满
        if (counter >= stus.length) {
            System.out.println("Add failure, too many students!");
            return;
        }
        // 获取用户输入的学生信息
        System.out.print("Please input name:");
        name = in.next();
        System.out.print("Please input age:");
        age = in.nextInt();
        System.out.print("Please input gender:");
        gender = in.next();
        // 创建学生对象
        s = new Student(name, age, gender);
        // 关键代码：将学生对象添加到管理系统中
        stus[counter] = s;
        counter++;
        System.out.println("Add student success!");
    }

/**
 * 删除学生信息
 * 该方法首先调用findStudent方法找到学生在数组中的位置，如果未找到则输出提示信息并返回；
 * 如果找到学生，则通过循环将被删除学生之后的所有学生信息向前移动一位，然后将数组末尾置为null，
 * 并减少counter计数，表示删除了一个学生最后输出删除成功的提示信息
 */
public void deleteStudent() {
    // 找到要删除的学生在数组中的位置
    int index = findStudent();
    // 如果未找到学生
    if (index == -1) {
        System.out.println("Student not found!");
        return;
    }
    // 将要删除的学生信息及其后续所有学生信息向前移动一位
    for (int i = index; i < counter - 1; i++) {
        stus[i] = stus[i + 1];
    }
    // 将数组末尾置为null，表示删除了学生信息
    stus[--counter] = null;
    // 输出删除成功的提示信息
    System.out.println("Delete student success!");
}

    // 更新学生信息
    /**
     * 更新学生信息的方法
     * 它首先查找学生记录，如果找到，则允许用户更新学生的姓名、年龄和性别
     */
    public void updateStudent() {
        // 查找学生记录的索引
        int index = findStudent();
        // 如果找不到学生记录，提示用户并返回
        if (index == -1) {
            System.out.println("Student not found!");
            return;
        }
        // 提示用户输入新的姓名，并读取输入
        System.out.print("Please input new name:");
        String newName = in.next();
        // 提示用户输入新的年龄，并读取输入
        System.out.print("Please input new age:");
        int newAge = in.nextInt();
        // 提示用户输入新的性别，并读取输入
        System.out.print("Please input new gender:");
        String newGender = in.next();
        // 更新找到的学生记录的姓名、年龄和性别
        stus[index].setName(newName);
        stus[index].setAge(newAge);
        stus[index].setGender(newGender);
        // 提示用户学生信息更新成功
        System.out.println("Update student success!");
    }

/**
 * 查询学生信息
 * 该方法首先调用findStudent方法查找学生如果学生不存在，则输出提示信息并返回
 * 如果学生存在，则输出学生的姓名、年龄和性别信息
 */
public void selectStudent() {
    // 查找学生
    int index = findStudent();
    // 如果找不到学生
    if (index == -1) {
        System.out.println("Student not found!");
        return;
    }
    // 输出学生姓名
    System.out.println("Name: " + stus[index].getName());
    // 输出学生年龄
    System.out.println("Age: " + stus[index].getAge());
    // 输出学生性别
    System.out.println("Gender: " + stus[index].getGender());
}

    /**
     * 主函数，用于学生管理系统的运行
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 实例化学生管理系统对象
        StudentManagement sm = new StudentManagement();
        // 用户操作标志，用于选择不同的操作
        int option = -1;
        Loop: while (true) {
            // 打印操作提示信息
            sm.prompt();
            // 获取用户选择的操作选项
            option = sm.in.nextInt();
            // 检查用户输入是否有效，若无效则继续提示输入
            if (option < 0 || option > 4)
                continue;
            // 根据用户选择执行相应的操作
            switch (option) {
                case 1:
                    // 添加学生信息
                    sm.addStudent();
                    break;
                case 2:
                    // 删除学生信息
                    sm.deleteStudent();
                    break;
                case 3:
                    // 修改学生信息
                    sm.updateStudent();
                    break;
                case 4:
                    // 查询学生信息
                    sm.selectStudent();
                    break;
                case 0:
                    // 退出系统
                    break Loop;
            } // end switch
        } // end while
        // 系统结束运行提示
        System.out.println("系统已关闭，再见");
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

    public static Student getStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudent'");
    }
}