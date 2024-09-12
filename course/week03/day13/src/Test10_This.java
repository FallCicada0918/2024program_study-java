/*
 * @Description: 
 * @Author: FallCicada
 * @Date: 2024-09-11 19:32:23
 * @LastEditors: FallCicada
 * @LastEditTime: 2024-09-11 19:38:41
 */
public class Test10_This {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.show();
        System.out.println("-----------");
        t.disp();
    }
}

class Teacher {
    // 初始化成员变量
    private String name = "unknown";
    private int age = 0;
    private String gender = "男";

    public void show() {
        // 局部变量与成员变量同名，这里使用局部变量
        String name = "Tom";
        int age = 20;
        System.out.println("name：" + name); // 打印局部变量
        System.out.println("age：" + age);   // 打印局部变量
        System.out.println("gender：" + gender); // 打印成员变量
    }

    public void disp() {
        name = "jack";
        age = 18;
        // 使用 this 关键字来区分成员变量与方法内的局部变量
        System.out.println("this.age：" + this.age); // 打印成员变量
        System.out.println("this.name：" + this.name); // 打印成员变量
        System.out.println("this.gender：" + this.gender); // 打印成员变量
    }
}